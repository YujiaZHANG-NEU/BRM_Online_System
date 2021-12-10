package com.brm.version1.service;

import com.brm.version1.entity.ConnectTeam;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (ConnectTeam)表服务接口
 *
 * @author makejava
 * @since 2021-11-30 13:28:59
 */
public interface ConnectTeamService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    ConnectTeam queryById(Integer id);

    /**
     * 分页查询
     *
     * @param connectTeam 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<ConnectTeam> queryByPage(ConnectTeam connectTeam, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param connectTeam 实例对象
     * @return 实例对象
     */
    ConnectTeam insert(ConnectTeam connectTeam);

    /**
     * 修改数据
     *
     * @param connectTeam 实例对象
     * @return 实例对象
     */
    ConnectTeam update(ConnectTeam connectTeam);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
