package com.brm.version1.service.impl;

import com.brm.version1.entity.CommonPackage;
import com.brm.version1.dao.CommonPackageDao;
import com.brm.version1.service.CommonPackageService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (CommonPackage)表服务实现类
 *
 * @author makejava
 * @since 2021-11-30 13:27:43
 */
@Service("commonPackageService")
public class CommonPackageServiceImpl implements CommonPackageService {
    @Resource
    private CommonPackageDao commonPackageDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public CommonPackage queryById(Integer id) {
        return this.commonPackageDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param commonPackage 筛选条件
     * @param pageRequest   分页对象
     * @return 查询结果
     */
    @Override
    public Page<CommonPackage> queryByPage(CommonPackage commonPackage, PageRequest pageRequest) {
        long total = this.commonPackageDao.count(commonPackage);
        return new PageImpl<>(this.commonPackageDao.queryAllByLimit(commonPackage, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param commonPackage 实例对象
     * @return 实例对象
     */
    @Override
    public CommonPackage insert(CommonPackage commonPackage) {
        this.commonPackageDao.insert(commonPackage);
        return commonPackage;
    }

    /**
     * 修改数据
     *
     * @param commonPackage 实例对象
     * @return 实例对象
     */
    @Override
    public CommonPackage update(CommonPackage commonPackage) {
        this.commonPackageDao.update(commonPackage);
        return this.queryById(commonPackage.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.commonPackageDao.deleteById(id) > 0;
    }
}
