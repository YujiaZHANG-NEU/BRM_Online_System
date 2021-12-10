package com.brm.version1.service;

import com.brm.version1.entity.ThirdPartyChannel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (ThirdPartyChannel)表服务接口
 *
 * @author makejava
 * @since 2021-11-30 13:31:09
 */
public interface ThirdPartyChannelService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    ThirdPartyChannel queryById(Integer id);

    /**
     * 分页查询
     *
     * @param thirdPartyChannel 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<ThirdPartyChannel> queryByPage(ThirdPartyChannel thirdPartyChannel, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param thirdPartyChannel 实例对象
     * @return 实例对象
     */
    ThirdPartyChannel insert(ThirdPartyChannel thirdPartyChannel);

    /**
     * 修改数据
     *
     * @param thirdPartyChannel 实例对象
     * @return 实例对象
     */
    ThirdPartyChannel update(ThirdPartyChannel thirdPartyChannel);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
