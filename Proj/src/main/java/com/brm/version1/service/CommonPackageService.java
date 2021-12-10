package com.brm.version1.service;

import com.brm.version1.entity.CommonPackage;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (CommonPackage)表服务接口
 *
 * @author makejava
 * @since 2021-11-30 13:27:43
 */
public interface CommonPackageService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CommonPackage queryById(Integer id);

    /**
     * 分页查询
     *
     * @param commonPackage 筛选条件
     * @param pageRequest   分页对象
     * @return 查询结果
     */
    Page<CommonPackage> queryByPage(CommonPackage commonPackage, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param commonPackage 实例对象
     * @return 实例对象
     */
    CommonPackage insert(CommonPackage commonPackage);

    /**
     * 修改数据
     *
     * @param commonPackage 实例对象
     * @return 实例对象
     */
    CommonPackage update(CommonPackage commonPackage);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
