package com.brm.version1.service.impl;

import com.brm.version1.entity.CommonService;
import com.brm.version1.dao.CommonServiceDao;
import com.brm.version1.service.CommonServiceService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;
import java.util.List;

/**
 * (CommonService)表服务实现类
 *
 * @author makejava
 * @since 2021-12-02 17:53:53
 */
@Service("commonServiceService")
public class CommonServiceServiceImpl implements CommonServiceService {
    @Resource
    private CommonServiceDao commonServiceDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public List<CommonService> queryAll(){
        return this.commonServiceDao.queryAll();
    }
    @Override
    public CommonService queryById(Integer id) {
        return this.commonServiceDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param commonService 筛选条件
     * @param pageRequest   分页对象
     * @return 查询结果
     */
    @Override
    public Page<CommonService> queryByPage(CommonService commonService, PageRequest pageRequest) {
        long total = this.commonServiceDao.count(commonService);
        return new PageImpl<>(this.commonServiceDao.queryAllByLimit(commonService, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param commonService 实例对象
     * @return 实例对象
     */
    @Override
    public CommonService insert(CommonService commonService) {
        this.commonServiceDao.insert(commonService);
        return commonService;
    }

    /**
     * 修改数据
     *
     * @param commonService 实例对象
     * @return 实例对象
     */
    @Override
    public CommonService update(CommonService commonService) {
        this.commonServiceDao.update(commonService);
        return this.queryById(commonService.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.commonServiceDao.deleteById(id) > 0;
    }
}
