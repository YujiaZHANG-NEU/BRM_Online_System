package com.brm.version1.controller;

import com.brm.version1.entity.CommonService;
import com.brm.version1.service.CommonServiceService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (CommonService)表控制层
 *
 * @author makejava
 * @since 2021-12-02 17:53:53
 */
@RestController
@RequestMapping("commonService")
public class CommonServiceController {
    /**
     * 服务对象
     */
    @Resource
    private CommonServiceService commonServiceService;

    /**
     * 分页查询
     *
     * @param commonService 筛选条件
     * @param pageRequest   分页对象
     * @return 查询结果
     */
    @GetMapping("queryAll")
    public ResponseEntity<List<CommonService>> queryAll(){
        return ResponseEntity.ok(this.commonServiceService.queryAll());
    }
    @GetMapping
    public ResponseEntity<Page<CommonService>> queryByPage(CommonService commonService, PageRequest pageRequest) {
        return ResponseEntity.ok(this.commonServiceService.queryByPage(commonService, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<CommonService> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.commonServiceService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param commonService 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<CommonService> add(CommonService commonService) {
        return ResponseEntity.ok(this.commonServiceService.insert(commonService));
    }

    /**
     * 编辑数据
     *
     * @param commonService 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<CommonService> edit(CommonService commonService) {
        return ResponseEntity.ok(this.commonServiceService.update(commonService));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.commonServiceService.deleteById(id));
    }

}

