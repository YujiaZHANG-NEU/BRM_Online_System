package com.brm.version1.controller;

import com.brm.version1.entity.OfficialCustomer;
import com.brm.version1.service.OfficialCustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (OfficialCustomer)表控制层
 *
 * @author makejava
 * @since 2021-11-30 13:29:40
 */
@Slf4j
@RestController
@RequestMapping("officialCustomer")
public class OfficialCustomerController {
    /**
     * 服务对象
     */
    @Resource
    private OfficialCustomerService officialCustomerService;

    /**
     * 分页查询
     *
     * @param officialCustomer 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<OfficialCustomer>> queryByPage(OfficialCustomer officialCustomer, PageRequest pageRequest) {
        return ResponseEntity.ok(this.officialCustomerService.queryByPage(officialCustomer, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<OfficialCustomer> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.officialCustomerService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param officialCustomer 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<OfficialCustomer> add(OfficialCustomer officialCustomer) {
        return ResponseEntity.ok(this.officialCustomerService.insert(officialCustomer));
    }

    /**
     * 编辑数据
     *
     * @param officialCustomer 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<OfficialCustomer> edit(OfficialCustomer officialCustomer) {
        return ResponseEntity.ok(this.officialCustomerService.update(officialCustomer));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.officialCustomerService.deleteById(id));
    }

}

