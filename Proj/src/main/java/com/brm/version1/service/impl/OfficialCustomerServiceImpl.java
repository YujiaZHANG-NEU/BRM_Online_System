package com.brm.version1.service.impl;

import com.brm.version1.entity.OfficialCustomer;
import com.brm.version1.dao.OfficialCustomerDao;
import com.brm.version1.service.OfficialCustomerService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (OfficialCustomer)表服务实现类
 *
 * @author makejava
 * @since 2021-11-30 13:29:41
 */
@Service("officialCustomerService")
public class OfficialCustomerServiceImpl implements OfficialCustomerService {
    @Resource
    private OfficialCustomerDao officialCustomerDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public OfficialCustomer queryById(Integer id) {
        return this.officialCustomerDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param officialCustomer 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<OfficialCustomer> queryByPage(OfficialCustomer officialCustomer, PageRequest pageRequest) {
        long total = this.officialCustomerDao.count(officialCustomer);
        return new PageImpl<>(this.officialCustomerDao.queryAllByLimit(officialCustomer, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param officialCustomer 实例对象
     * @return 实例对象
     */
    @Override
    public OfficialCustomer insert(OfficialCustomer officialCustomer) {
        this.officialCustomerDao.insert(officialCustomer);
        return officialCustomer;
    }

    /**
     * 修改数据
     *
     * @param officialCustomer 实例对象
     * @return 实例对象
     */
    @Override
    public OfficialCustomer update(OfficialCustomer officialCustomer) {
        this.officialCustomerDao.update(officialCustomer);
        return this.queryById(officialCustomer.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.officialCustomerDao.deleteById(id) > 0;
    }
}
