package com.brm.version1.controller;

import com.brm.version1.entity.VipPackage;
import com.brm.version1.service.VipPackageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (VipPackage)表控制层
 *
 * @author makejava
 * @since 2021-11-30 13:31:55
 */
@Slf4j
@RestController
@RequestMapping("vipPackage")
public class VipPackageController {
    /**
     * 服务对象
     */
    @Resource
    private VipPackageService vipPackageService;

    /**
     * 分页查询
     *
     * @param vipPackage 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<VipPackage>> queryByPage(VipPackage vipPackage, PageRequest pageRequest) {
        return ResponseEntity.ok(this.vipPackageService.queryByPage(vipPackage, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<VipPackage> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.vipPackageService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param vipPackage 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<VipPackage> add(VipPackage vipPackage) {
        return ResponseEntity.ok(this.vipPackageService.insert(vipPackage));
    }

    /**
     * 编辑数据
     *
     * @param vipPackage 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<VipPackage> edit(VipPackage vipPackage) {
        return ResponseEntity.ok(this.vipPackageService.update(vipPackage));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.vipPackageService.deleteById(id));
    }

}

