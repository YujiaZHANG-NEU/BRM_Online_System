package com.brm.version1.controller;

import com.brm.version1.entity.Provider;
import com.brm.version1.service.ProviderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Provider)表控制层
 *
 * @author makejava
 * @since 2021-11-30 13:30:33
 */
@Slf4j
@RestController
@RequestMapping("provider")
public class ProviderController {
    /**
     * 服务对象
     */
    @Resource
    private ProviderService providerService;

    /**
     * 分页查询
     *
     * @param provider 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Provider>> queryByPage(Provider provider, PageRequest pageRequest) {
        return ResponseEntity.ok(this.providerService.queryByPage(provider, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Provider> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.providerService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param provider 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Provider> add(Provider provider) {
        return ResponseEntity.ok(this.providerService.insert(provider));
    }

    /**
     * 编辑数据
     *
     * @param provider 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Provider> edit(Provider provider) {
        return ResponseEntity.ok(this.providerService.update(provider));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.providerService.deleteById(id));
    }

}

