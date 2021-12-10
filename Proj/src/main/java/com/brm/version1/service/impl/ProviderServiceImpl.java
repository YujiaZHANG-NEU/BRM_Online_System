package com.brm.version1.service.impl;

import com.brm.version1.entity.Provider;
import com.brm.version1.dao.ProviderDao;
import com.brm.version1.service.ProviderService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Provider)表服务实现类
 *
 * @author makejava
 * @since 2021-11-30 13:30:34
 */
@Service("providerService")
public class ProviderServiceImpl implements ProviderService {
    @Resource
    private ProviderDao providerDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Provider queryById(Integer id) {
        return this.providerDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param provider 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Provider> queryByPage(Provider provider, PageRequest pageRequest) {
        long total = this.providerDao.count(provider);
        return new PageImpl<>(this.providerDao.queryAllByLimit(provider, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param provider 实例对象
     * @return 实例对象
     */
    @Override
    public Provider insert(Provider provider) {
        this.providerDao.insert(provider);
        return provider;
    }

    /**
     * 修改数据
     *
     * @param provider 实例对象
     * @return 实例对象
     */
    @Override
    public Provider update(Provider provider) {
        this.providerDao.update(provider);
        return this.queryById(provider.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.providerDao.deleteById(id) > 0;
    }
}
