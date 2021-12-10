package com.brm.version1.service.impl;

import com.brm.version1.entity.ConnectTeam;
import com.brm.version1.dao.ConnectTeamDao;
import com.brm.version1.service.ConnectTeamService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (ConnectTeam)表服务实现类
 *
 * @author makejava
 * @since 2021-11-30 13:28:59
 */
@Service("connectTeamService")
public class ConnectTeamServiceImpl implements ConnectTeamService {
    @Resource
    private ConnectTeamDao connectTeamDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public ConnectTeam queryById(Integer id) {
        return this.connectTeamDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param connectTeam 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<ConnectTeam> queryByPage(ConnectTeam connectTeam, PageRequest pageRequest) {
        long total = this.connectTeamDao.count(connectTeam);
        return new PageImpl<>(this.connectTeamDao.queryAllByLimit(connectTeam, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param connectTeam 实例对象
     * @return 实例对象
     */
    @Override
    public ConnectTeam insert(ConnectTeam connectTeam) {
        this.connectTeamDao.insert(connectTeam);
        return connectTeam;
    }

    /**
     * 修改数据
     *
     * @param connectTeam 实例对象
     * @return 实例对象
     */
    @Override
    public ConnectTeam update(ConnectTeam connectTeam) {
        this.connectTeamDao.update(connectTeam);
        return this.queryById(connectTeam.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.connectTeamDao.deleteById(id) > 0;
    }
}
