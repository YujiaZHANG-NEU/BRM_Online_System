package com.brm.version1.service;

import com.brm.version1.entity.VipCustomer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (VipCustomer)表服务接口
 *
 * @author makejava
 * @since 2021-11-30 13:31:20
 */
public interface VipCustomerService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    VipCustomer queryById(Integer id);

    /**
     * 分页查询
     *
     * @param vipCustomer 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<VipCustomer> queryByPage(VipCustomer vipCustomer, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param vipCustomer 实例对象
     * @return 实例对象
     */
    VipCustomer insert(VipCustomer vipCustomer);

    /**
     * 修改数据
     *
     * @param vipCustomer 实例对象
     * @return 实例对象
     */
    VipCustomer update(VipCustomer vipCustomer);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
