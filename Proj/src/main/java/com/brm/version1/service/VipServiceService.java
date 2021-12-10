package com.brm.version1.service;

import com.brm.version1.entity.VipService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (VipService)表服务接口
 *
 * @author makejava
 * @since 2021-11-30 13:32:12
 */
public interface VipServiceService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    VipService queryById(Integer id);

    /**
     * 分页查询
     *
     * @param vipService  筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    Page<VipService> queryByPage(VipService vipService, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param vipService 实例对象
     * @return 实例对象
     */
    VipService insert(VipService vipService);

    /**
     * 修改数据
     *
     * @param vipService 实例对象
     * @return 实例对象
     */
    VipService update(VipService vipService);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
