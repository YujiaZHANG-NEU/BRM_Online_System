package com.brm.version1.service.impl;

import com.brm.version1.entity.VipService;
import com.brm.version1.dao.VipServiceDao;
import com.brm.version1.service.VipServiceService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (VipService)表服务实现类
 *
 * @author makejava
 * @since 2021-11-30 13:32:12
 */
@Service("vipServiceService")
public class VipServiceServiceImpl implements VipServiceService {
    @Resource
    private VipServiceDao vipServiceDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public VipService queryById(Integer id) {
        return this.vipServiceDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param vipService  筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @Override
    public Page<VipService> queryByPage(VipService vipService, PageRequest pageRequest) {
        long total = this.vipServiceDao.count(vipService);
        return new PageImpl<>(this.vipServiceDao.queryAllByLimit(vipService, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param vipService 实例对象
     * @return 实例对象
     */
    @Override
    public VipService insert(VipService vipService) {
        this.vipServiceDao.insert(vipService);
        return vipService;
    }

    /**
     * 修改数据
     *
     * @param vipService 实例对象
     * @return 实例对象
     */
    @Override
    public VipService update(VipService vipService) {
        this.vipServiceDao.update(vipService);
        return this.queryById(vipService.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.vipServiceDao.deleteById(id) > 0;
    }
}
