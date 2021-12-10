package com.brm.version1.service;

import com.brm.version1.entity.OnboardingTeam;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (OnboardingTeam)表服务接口
 *
 * @author makejava
 * @since 2021-11-30 13:29:54
 */
public interface OnboardingTeamService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    OnboardingTeam queryById(Integer id);

    /**
     * 分页查询
     *
     * @param onboardingTeam 筛选条件
     * @param pageRequest    分页对象
     * @return 查询结果
     */
    Page<OnboardingTeam> queryByPage(OnboardingTeam onboardingTeam, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param onboardingTeam 实例对象
     * @return 实例对象
     */
    OnboardingTeam insert(OnboardingTeam onboardingTeam);

    /**
     * 修改数据
     *
     * @param onboardingTeam 实例对象
     * @return 实例对象
     */
    OnboardingTeam update(OnboardingTeam onboardingTeam);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
