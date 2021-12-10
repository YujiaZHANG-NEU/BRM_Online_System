package com.brm.version1.dao;

import com.brm.version1.entity.VipCustomer;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (VipCustomer)表数据库访问层
 *
 * @author makejava
 * @since 2021-11-30 13:31:19
 */
@Mapper
public interface VipCustomerDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    VipCustomer queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param vipCustomer 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<VipCustomer> queryAllByLimit(VipCustomer vipCustomer, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param vipCustomer 查询条件
     * @return 总行数
     */
    long count(VipCustomer vipCustomer);

    /**
     * 新增数据
     *
     * @param vipCustomer 实例对象
     * @return 影响行数
     */
    int insert(VipCustomer vipCustomer);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<VipCustomer> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<VipCustomer> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<VipCustomer> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<VipCustomer> entities);

    /**
     * 修改数据
     *
     * @param vipCustomer 实例对象
     * @return 影响行数
     */
    int update(VipCustomer vipCustomer);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

