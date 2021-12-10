package com.brm.version1.service;

import com.brm.version1.entity.VipPackage;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (VipPackage)表服务接口
 *
 * @author makejava
 * @since 2021-11-30 13:31:58
 */
public interface VipPackageService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    VipPackage queryById(Integer id);

    /**
     * 分页查询
     *
     * @param vipPackage 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<VipPackage> queryByPage(VipPackage vipPackage, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param vipPackage 实例对象
     * @return 实例对象
     */
    VipPackage insert(VipPackage vipPackage);

    /**
     * 修改数据
     *
     * @param vipPackage 实例对象
     * @return 实例对象
     */
    VipPackage update(VipPackage vipPackage);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
