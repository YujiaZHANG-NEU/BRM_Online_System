package com.brm.version1.service;

import com.brm.version1.entity.OfficialCustomer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (OfficialCustomer)表服务接口
 *
 * @author makejava
 * @since 2021-11-30 13:29:41
 */
public interface OfficialCustomerService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    OfficialCustomer queryById(Integer id);

    /**
     * 分页查询
     *
     * @param officialCustomer 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<OfficialCustomer> queryByPage(OfficialCustomer officialCustomer, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param officialCustomer 实例对象
     * @return 实例对象
     */
    OfficialCustomer insert(OfficialCustomer officialCustomer);

    /**
     * 修改数据
     *
     * @param officialCustomer 实例对象
     * @return 实例对象
     */
    OfficialCustomer update(OfficialCustomer officialCustomer);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
