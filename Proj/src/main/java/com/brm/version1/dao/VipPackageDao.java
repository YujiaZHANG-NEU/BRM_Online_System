package com.brm.version1.dao;

import com.brm.version1.entity.VipPackage;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (VipPackage)表数据库访问层
 *
 * @author makejava
 * @since 2021-11-30 13:31:56
 */
@Mapper
public interface VipPackageDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    VipPackage queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param vipPackage 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<VipPackage> queryAllByLimit(VipPackage vipPackage, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param vipPackage 查询条件
     * @return 总行数
     */
    long count(VipPackage vipPackage);

    /**
     * 新增数据
     *
     * @param vipPackage 实例对象
     * @return 影响行数
     */
    int insert(VipPackage vipPackage);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<VipPackage> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<VipPackage> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<VipPackage> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<VipPackage> entities);

    /**
     * 修改数据
     *
     * @param vipPackage 实例对象
     * @return 影响行数
     */
    int update(VipPackage vipPackage);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

