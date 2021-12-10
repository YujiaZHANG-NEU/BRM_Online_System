package com.brm.version1.service;

import com.brm.version1.entity.CommonService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

/**
 * (CommonService)表服务接口
 *
 * @author makejava
 * @since 2021-12-02 17:53:53
 */
public interface CommonServiceService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CommonService queryById(Integer id);
    List<CommonService> queryAll();

    /**
     * 分页查询
     *
     * @param commonService 筛选条件
     * @param pageRequest   分页对象
     * @return 查询结果
     */
    Page<CommonService> queryByPage(CommonService commonService, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param commonService 实例对象
     * @return 实例对象
     */
    CommonService insert(CommonService commonService);

    /**
     * 修改数据
     *
     * @param commonService 实例对象
     * @return 实例对象
     */
    CommonService update(CommonService commonService);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
