package com.brm.version1.service.impl;

import com.brm.version1.entity.ThirdPartyChannel;
import com.brm.version1.dao.ThirdPartyChannelDao;
import com.brm.version1.service.ThirdPartyChannelService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (ThirdPartyChannel)表服务实现类
 *
 * @author makejava
 * @since 2021-11-30 13:31:09
 */
@Service("thirdPartyChannelService")
public class ThirdPartyChannelServiceImpl implements ThirdPartyChannelService {
    @Resource
    private ThirdPartyChannelDao thirdPartyChannelDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public ThirdPartyChannel queryById(Integer id) {
        return this.thirdPartyChannelDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param thirdPartyChannel 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<ThirdPartyChannel> queryByPage(ThirdPartyChannel thirdPartyChannel, PageRequest pageRequest) {
        long total = this.thirdPartyChannelDao.count(thirdPartyChannel);
        return new PageImpl<>(this.thirdPartyChannelDao.queryAllByLimit(thirdPartyChannel, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param thirdPartyChannel 实例对象
     * @return 实例对象
     */
    @Override
    public ThirdPartyChannel insert(ThirdPartyChannel thirdPartyChannel) {
        this.thirdPartyChannelDao.insert(thirdPartyChannel);
        return thirdPartyChannel;
    }

    /**
     * 修改数据
     *
     * @param thirdPartyChannel 实例对象
     * @return 实例对象
     */
    @Override
    public ThirdPartyChannel update(ThirdPartyChannel thirdPartyChannel) {
        this.thirdPartyChannelDao.update(thirdPartyChannel);
        return this.queryById(thirdPartyChannel.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.thirdPartyChannelDao.deleteById(id) > 0;
    }
}
