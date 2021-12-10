package com.brm.version1.controller;

import com.brm.version1.entity.ThirdPartyChannel;
import com.brm.version1.service.ThirdPartyChannelService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (ThirdPartyChannel)表控制层
 *
 * @author makejava
 * @since 2021-11-30 13:31:08
 */
@Slf4j
@RestController
@RequestMapping("thirdPartyChannel")
public class ThirdPartyChannelController {
    /**
     * 服务对象
     */
    @Resource
    private ThirdPartyChannelService thirdPartyChannelService;

    /**
     * 分页查询
     *
     * @param thirdPartyChannel 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<ThirdPartyChannel>> queryByPage(ThirdPartyChannel thirdPartyChannel, PageRequest pageRequest) {
        return ResponseEntity.ok(this.thirdPartyChannelService.queryByPage(thirdPartyChannel, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<ThirdPartyChannel> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.thirdPartyChannelService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param thirdPartyChannel 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<ThirdPartyChannel> add(ThirdPartyChannel thirdPartyChannel) {
        return ResponseEntity.ok(this.thirdPartyChannelService.insert(thirdPartyChannel));
    }

    /**
     * 编辑数据
     *
     * @param thirdPartyChannel 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<ThirdPartyChannel> edit(ThirdPartyChannel thirdPartyChannel) {
        return ResponseEntity.ok(this.thirdPartyChannelService.update(thirdPartyChannel));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.thirdPartyChannelService.deleteById(id));
    }

}

