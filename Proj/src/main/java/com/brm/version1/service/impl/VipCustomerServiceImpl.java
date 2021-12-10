package com.brm.version1.service.impl;

import com.brm.version1.entity.VipCustomer;
import com.brm.version1.dao.VipCustomerDao;
import com.brm.version1.service.VipCustomerService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (VipCustomer)表服务实现类
 *
 * @author makejava
 * @since 2021-11-30 13:31:20
 */
@Service("vipCustomerService")
public class VipCustomerServiceImpl implements VipCustomerService {
    @Resource
    private VipCustomerDao vipCustomerDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public VipCustomer queryById(Integer id) {
        return this.vipCustomerDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param vipCustomer 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<VipCustomer> queryByPage(VipCustomer vipCustomer, PageRequest pageRequest) {
        long total = this.vipCustomerDao.count(vipCustomer);
        return new PageImpl<>(this.vipCustomerDao.queryAllByLimit(vipCustomer, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param vipCustomer 实例对象
     * @return 实例对象
     */
    @Override
    public VipCustomer insert(VipCustomer vipCustomer) {
        this.vipCustomerDao.insert(vipCustomer);
        return vipCustomer;
    }

    /**
     * 修改数据
     *
     * @param vipCustomer 实例对象
     * @return 实例对象
     */
    @Override
    public VipCustomer update(VipCustomer vipCustomer) {
        this.vipCustomerDao.update(vipCustomer);
        return this.queryById(vipCustomer.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.vipCustomerDao.deleteById(id) > 0;
    }
}
