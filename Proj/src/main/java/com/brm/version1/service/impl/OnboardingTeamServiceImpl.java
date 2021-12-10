package com.brm.version1.service.impl;

import com.brm.version1.entity.OnboardingTeam;
import com.brm.version1.dao.OnboardingTeamDao;
import com.brm.version1.service.OnboardingTeamService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (OnboardingTeam)表服务实现类
 *
 * @author makejava
 * @since 2021-11-30 13:29:54
 */
@Service("onboardingTeamService")
public class OnboardingTeamServiceImpl implements OnboardingTeamService {
    @Resource
    private OnboardingTeamDao onboardingTeamDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public OnboardingTeam queryById(Integer id) {
        return this.onboardingTeamDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param onboardingTeam 筛选条件
     * @param pageRequest    分页对象
     * @return 查询结果
     */
    @Override
    public Page<OnboardingTeam> queryByPage(OnboardingTeam onboardingTeam, PageRequest pageRequest) {
        long total = this.onboardingTeamDao.count(onboardingTeam);
        return new PageImpl<>(this.onboardingTeamDao.queryAllByLimit(onboardingTeam, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param onboardingTeam 实例对象
     * @return 实例对象
     */
    @Override
    public OnboardingTeam insert(OnboardingTeam onboardingTeam) {
        this.onboardingTeamDao.insert(onboardingTeam);
        return onboardingTeam;
    }

    /**
     * 修改数据
     *
     * @param onboardingTeam 实例对象
     * @return 实例对象
     */
    @Override
    public OnboardingTeam update(OnboardingTeam onboardingTeam) {
        this.onboardingTeamDao.update(onboardingTeam);
        return this.queryById(onboardingTeam.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.onboardingTeamDao.deleteById(id) > 0;
    }
}
