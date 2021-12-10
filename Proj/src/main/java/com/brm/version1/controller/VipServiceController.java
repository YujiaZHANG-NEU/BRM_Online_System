package com.brm.version1.controller;

import com.brm.version1.entity.VipService;
import com.brm.version1.service.VipServiceService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (VipService)表控制层
 *
 * @author makejava
 * @since 2021-11-30 13:32:12
 */
@Slf4j
@RestController
@RequestMapping("vipService")
public class VipServiceController {
    /**
     * 服务对象
     */
    @Resource
    private VipServiceService vipServiceService;

    /**
     * 分页查询
     *
     * @param vipService  筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<VipService>> queryByPage(VipService vipService, PageRequest pageRequest) {
        return ResponseEntity.ok(this.vipServiceService.queryByPage(vipService, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<VipService> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.vipServiceService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param vipService 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<VipService> add(VipService vipService) {
        return ResponseEntity.ok(this.vipServiceService.insert(vipService));
    }

    /**
     * 编辑数据
     *
     * @param vipService 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<VipService> edit(VipService vipService) {
        return ResponseEntity.ok(this.vipServiceService.update(vipService));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.vipServiceService.deleteById(id));
    }

}

