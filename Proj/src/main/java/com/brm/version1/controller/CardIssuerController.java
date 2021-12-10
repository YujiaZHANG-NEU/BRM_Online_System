package com.brm.version1.controller;

import com.brm.version1.entity.CardIssuer;
import com.brm.version1.service.CardIssuerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (CardIssuer)表控制层
 *
 * @author makejava
 * @since 2021-11-30 13:28:16
 */
@Slf4j
@RestController
@RequestMapping("cardIssuer")
public class CardIssuerController {
    /**
     * 服务对象
     */
    @Resource
    private CardIssuerService cardIssuerService;

    /**
     * 分页查询
     *
     * @param cardIssuer 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<CardIssuer>> queryByPage(CardIssuer cardIssuer, PageRequest pageRequest) {
        return ResponseEntity.ok(this.cardIssuerService.queryByPage(cardIssuer, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<CardIssuer> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.cardIssuerService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param cardIssuer 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<CardIssuer> add(CardIssuer cardIssuer) {
        return ResponseEntity.ok(this.cardIssuerService.insert(cardIssuer));
    }

    /**
     * 编辑数据
     *
     * @param cardIssuer 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<CardIssuer> edit(CardIssuer cardIssuer) {
        return ResponseEntity.ok(this.cardIssuerService.update(cardIssuer));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.cardIssuerService.deleteById(id));
    }

}

