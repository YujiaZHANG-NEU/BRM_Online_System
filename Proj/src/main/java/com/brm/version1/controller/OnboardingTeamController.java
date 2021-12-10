package com.brm.version1.controller;

import com.brm.version1.entity.OnboardingTeam;
import com.brm.version1.service.OnboardingTeamService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (OnboardingTeam)表控制层
 *
 * @author makejava
 * @since 2021-11-30 13:29:54
 */
@Slf4j
@RestController
@RequestMapping("onboardingTeam")
public class OnboardingTeamController {
    /**
     * 服务对象
     */
    @Resource
    private OnboardingTeamService onboardingTeamService;

    /**
     * 分页查询
     *
     * @param onboardingTeam 筛选条件
     * @param pageRequest    分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<OnboardingTeam>> queryByPage(OnboardingTeam onboardingTeam, PageRequest pageRequest) {
        return ResponseEntity.ok(this.onboardingTeamService.queryByPage(onboardingTeam, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<OnboardingTeam> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.onboardingTeamService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param onboardingTeam 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<OnboardingTeam> add(OnboardingTeam onboardingTeam) {
        return ResponseEntity.ok(this.onboardingTeamService.insert(onboardingTeam));
    }

    /**
     * 编辑数据
     *
     * @param onboardingTeam 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<OnboardingTeam> edit(OnboardingTeam onboardingTeam) {
        return ResponseEntity.ok(this.onboardingTeamService.update(onboardingTeam));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.onboardingTeamService.deleteById(id));
    }

}

