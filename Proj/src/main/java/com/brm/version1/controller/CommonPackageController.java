package com.brm.version1.controller;

import com.brm.version1.entity.CommonPackage;
import com.brm.version1.service.CommonPackageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (CommonPackage)表控制层
 *
 * @author makejava
 * @since 2021-11-30 13:27:43
 */
@Slf4j
@RestController
@RequestMapping("commonPackage")
public class CommonPackageController {
    /**
     * 服务对象
     */
    @Resource
    private CommonPackageService commonPackageService;

    /**
     * 分页查询
     *
     * @param commonPackage 筛选条件
     * @param pageRequest   分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<CommonPackage>> queryByPage(CommonPackage commonPackage, PageRequest pageRequest) {
        return ResponseEntity.ok(this.commonPackageService.queryByPage(commonPackage, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<CommonPackage> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.commonPackageService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param commonPackage 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<CommonPackage> add(CommonPackage commonPackage) {
        return ResponseEntity.ok(this.commonPackageService.insert(commonPackage));
    }

    /**
     * 编辑数据
     *
     * @param commonPackage 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<CommonPackage> edit(CommonPackage commonPackage) {
        return ResponseEntity.ok(this.commonPackageService.update(commonPackage));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.commonPackageService.deleteById(id));
    }

}

