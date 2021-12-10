package com.brm.version1.controller;

import com.brm.version1.entity.Customer;
import com.brm.version1.service.CommonServiceService;
import com.brm.version1.service.CustomerService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Customer)表控制层
 *
 * @author makejava
 * @since 2021-11-30 17:54:27
 */
@RestController
@RequestMapping("customer")
public class CustomerController {
    /**
     * 服务对象
     */
    @Resource
    private CustomerService customerService;
    @Resource
    private CommonServiceService commonServiceService;
    /**
     * 分页查询
     *
     * @param customer    筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Customer>> queryByPage(Customer customer, PageRequest pageRequest) {
        return ResponseEntity.ok(this.customerService.queryByPage(customer, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Customer> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.customerService.queryById(id));
    }

    @GetMapping("queryAll")
    public ResponseEntity<List<Customer>> queryAll(){
        return ResponseEntity.ok(this.customerService.queryAll());
    }

    /**
     * 新增数据
     *
     * @param customer 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Customer> add(Customer customer) {
        return ResponseEntity.ok(this.customerService.insert(customer));
    }

    /**
     * 编辑数据
     *
     * @param customer 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Customer> edit(Customer customer) {
        return ResponseEntity.ok(this.customerService.update(customer));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @GetMapping("deleteById/{id}")
    public ResponseEntity<Boolean> deleteById(@PathVariable Integer id) {
        this.commonServiceService.deleteById(this.customerService.queryById(id).getId());
        return ResponseEntity.ok(this.customerService.deleteById(id));
    }
}

