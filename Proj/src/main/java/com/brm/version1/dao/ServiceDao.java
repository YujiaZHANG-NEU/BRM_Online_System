package com.brm.version1.dao;

import com.brm.version1.entity.Service;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (Service)表数据库访问层
 *
 * @author makejava
 * @since 2021-11-30 13:30:45
 */
@Mapper
public interface ServiceDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Service queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param service 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<Service> queryAllByLimit(Service service, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param service 查询条件
     * @return 总行数
     */
    long count(Service service);

    /**
     * 新增数据
     *
     * @param service 实例对象
     * @return 影响行数
     */
    int insert(Service service);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Service> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Service> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Service> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Service> entities);

    /**
     * 修改数据
     *
     * @param service 实例对象
     * @return 影响行数
     */
    int update(Service service);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

