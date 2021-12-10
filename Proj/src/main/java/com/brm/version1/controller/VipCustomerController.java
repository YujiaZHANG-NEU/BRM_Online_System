package com.brm.version1.controller;

import com.brm.version1.entity.VipCustomer;
import com.brm.version1.service.VipCustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (VipCustomer)表控制层
 *
 * @author makejava
 * @since 2021-11-30 13:31:19
 */
@Slf4j
@RestController
@RequestMapping("vipCustomer")
public class VipCustomerController {
    /**
     * 服务对象
     */
    @Resource
    private VipCustomerService vipCustomerService;

    /**
     * 分页查询
     *
     * @param vipCustomer 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<VipCustomer>> queryByPage(VipCustomer vipCustomer, PageRequest pageRequest) {
        return ResponseEntity.ok(this.vipCustomerService.queryByPage(vipCustomer, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<VipCustomer> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.vipCustomerService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param vipCustomer 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<VipCustomer> add(VipCustomer vipCustomer) {
        return ResponseEntity.ok(this.vipCustomerService.insert(vipCustomer));
    }

    /**
     * 编辑数据
     *
     * @param vipCustomer 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<VipCustomer> edit(VipCustomer vipCustomer) {
        return ResponseEntity.ok(this.vipCustomerService.update(vipCustomer));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.vipCustomerService.deleteById(id));
    }

}

