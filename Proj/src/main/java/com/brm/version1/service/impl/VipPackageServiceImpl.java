package com.brm.version1.service.impl;

import com.brm.version1.entity.VipPackage;
import com.brm.version1.dao.VipPackageDao;
import com.brm.version1.service.VipPackageService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (VipPackage)表服务实现类
 *
 * @author makejava
 * @since 2021-11-30 13:31:59
 */
@Service("vipPackageService")
public class VipPackageServiceImpl implements VipPackageService {
    @Resource
    private VipPackageDao vipPackageDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public VipPackage queryById(Integer id) {
        return this.vipPackageDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param vipPackage 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<VipPackage> queryByPage(VipPackage vipPackage, PageRequest pageRequest) {
        long total = this.vipPackageDao.count(vipPackage);
        return new PageImpl<>(this.vipPackageDao.queryAllByLimit(vipPackage, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param vipPackage 实例对象
     * @return 实例对象
     */
    @Override
    public VipPackage insert(VipPackage vipPackage) {
        this.vipPackageDao.insert(vipPackage);
        return vipPackage;
    }

    /**
     * 修改数据
     *
     * @param vipPackage 实例对象
     * @return 实例对象
     */
    @Override
    public VipPackage update(VipPackage vipPackage) {
        this.vipPackageDao.update(vipPackage);
        return this.queryById(vipPackage.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.vipPackageDao.deleteById(id) > 0;
    }
}
