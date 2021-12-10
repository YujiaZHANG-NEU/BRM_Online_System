package com.brm.version1.dao;

import com.brm.version1.entity.CommonService;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * (CommonService)表数据库访问层
 *
 * @author makejava
 * @since 2021-12-02 17:53:53
 */
@Mapper
public interface CommonServiceDao {
    /**
     * 通过ID查询单条数据
     *
     *
     * @return 实例对象
     */
    List<CommonService> queryAll();
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CommonService queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param commonService 查询条件
     * @param pageable      分页对象
     * @return 对象列表
     */
    List<CommonService> queryAllByLimit(CommonService commonService, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param commonService 查询条件
     * @return 总行数
     */
    long count(CommonService commonService);

    /**
     * 新增数据
     *
     * @param commonService 实例对象
     * @return 影响行数
     */
    int insert(CommonService commonService);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<CommonService> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<CommonService> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<CommonService> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<CommonService> entities);

    /**
     * 修改数据
     *
     * @param commonService 实例对象
     * @return 影响行数
     */
    int update(CommonService commonService);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

