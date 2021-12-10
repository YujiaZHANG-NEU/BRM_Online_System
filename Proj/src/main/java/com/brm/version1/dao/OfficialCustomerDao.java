package com.brm.version1.dao;

import com.brm.version1.entity.OfficialCustomer;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (OfficialCustomer)表数据库访问层
 *
 * @author makejava
 * @since 2021-11-30 13:29:40
 */
@Mapper
public interface OfficialCustomerDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    OfficialCustomer queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param officialCustomer 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<OfficialCustomer> queryAllByLimit(OfficialCustomer officialCustomer, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param officialCustomer 查询条件
     * @return 总行数
     */
    long count(OfficialCustomer officialCustomer);

    /**
     * 新增数据
     *
     * @param officialCustomer 实例对象
     * @return 影响行数
     */
    int insert(OfficialCustomer officialCustomer);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<OfficialCustomer> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<OfficialCustomer> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<OfficialCustomer> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<OfficialCustomer> entities);

    /**
     * 修改数据
     *
     * @param officialCustomer 实例对象
     * @return 影响行数
     */
    int update(OfficialCustomer officialCustomer);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

