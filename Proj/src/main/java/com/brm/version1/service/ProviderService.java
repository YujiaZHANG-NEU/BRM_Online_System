package com.brm.version1.service;

import com.brm.version1.entity.Provider;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Provider)表服务接口
 *
 * @author makejava
 * @since 2021-11-30 13:30:34
 */
public interface ProviderService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Provider queryById(Integer id);

    /**
     * 分页查询
     *
     * @param provider 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Provider> queryByPage(Provider provider, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param provider 实例对象
     * @return 实例对象
     */
    Provider insert(Provider provider);

    /**
     * 修改数据
     *
     * @param provider 实例对象
     * @return 实例对象
     */
    Provider update(Provider provider);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
