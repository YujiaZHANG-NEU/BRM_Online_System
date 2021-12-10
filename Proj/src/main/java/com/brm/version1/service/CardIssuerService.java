package com.brm.version1.service;

import com.brm.version1.entity.CardIssuer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (CardIssuer)表服务接口
 *
 * @author makejava
 * @since 2021-11-30 13:28:20
 */
public interface CardIssuerService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CardIssuer queryById(Integer id);

    /**
     * 分页查询
     *
     * @param cardIssuer 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<CardIssuer> queryByPage(CardIssuer cardIssuer, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param cardIssuer 实例对象
     * @return 实例对象
     */
    CardIssuer insert(CardIssuer cardIssuer);

    /**
     * 修改数据
     *
     * @param cardIssuer 实例对象
     * @return 实例对象
     */
    CardIssuer update(CardIssuer cardIssuer);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
