package com.brm.version1.dao;

import com.brm.version1.entity.ThirdPartyChannel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (ThirdPartyChannel)表数据库访问层
 *
 * @author makejava
 * @since 2021-11-30 13:31:08
 */
@Mapper
public interface ThirdPartyChannelDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    ThirdPartyChannel queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param thirdPartyChannel 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<ThirdPartyChannel> queryAllByLimit(ThirdPartyChannel thirdPartyChannel, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param thirdPartyChannel 查询条件
     * @return 总行数
     */
    long count(ThirdPartyChannel thirdPartyChannel);

    /**
     * 新增数据
     *
     * @param thirdPartyChannel 实例对象
     * @return 影响行数
     */
    int insert(ThirdPartyChannel thirdPartyChannel);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<ThirdPartyChannel> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<ThirdPartyChannel> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<ThirdPartyChannel> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<ThirdPartyChannel> entities);

    /**
     * 修改数据
     *
     * @param thirdPartyChannel 实例对象
     * @return 影响行数
     */
    int update(ThirdPartyChannel thirdPartyChannel);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

