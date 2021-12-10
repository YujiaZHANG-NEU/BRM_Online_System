package com.brm.version1.service.impl;

import com.brm.version1.entity.CardIssuer;
import com.brm.version1.dao.CardIssuerDao;
import com.brm.version1.service.CardIssuerService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (CardIssuer)表服务实现类
 *
 * @author makejava
 * @since 2021-11-30 13:28:20
 */
@Service("cardIssuerService")
public class CardIssuerServiceImpl implements CardIssuerService {
    @Resource
    private CardIssuerDao cardIssuerDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public CardIssuer queryById(Integer id) {
        return this.cardIssuerDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param cardIssuer 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<CardIssuer> queryByPage(CardIssuer cardIssuer, PageRequest pageRequest) {
        long total = this.cardIssuerDao.count(cardIssuer);
        return new PageImpl<>(this.cardIssuerDao.queryAllByLimit(cardIssuer, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param cardIssuer 实例对象
     * @return 实例对象
     */
    @Override
    public CardIssuer insert(CardIssuer cardIssuer) {
        this.cardIssuerDao.insert(cardIssuer);
        return cardIssuer;
    }

    /**
     * 修改数据
     *
     * @param cardIssuer 实例对象
     * @return 实例对象
     */
    @Override
    public CardIssuer update(CardIssuer cardIssuer) {
        this.cardIssuerDao.update(cardIssuer);
        return this.queryById(cardIssuer.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.cardIssuerDao.deleteById(id) > 0;
    }
}
