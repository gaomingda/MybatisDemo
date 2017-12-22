package dao;

import java.util.List;
import model.MybatisDemo;
import model.MybatisDemoExample;
import org.apache.ibatis.annotations.Param;

public interface MybatisDemoMapper {
    long countByExample(MybatisDemoExample example);

    int deleteByExample(MybatisDemoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MybatisDemo record);

    int insertSelective(MybatisDemo record);

    List<MybatisDemo> selectByExample(MybatisDemoExample example);

    MybatisDemo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MybatisDemo record, @Param("example") MybatisDemoExample example);

    int updateByExample(@Param("record") MybatisDemo record, @Param("example") MybatisDemoExample example);

    int updateByPrimaryKeySelective(MybatisDemo record);

    int updateByPrimaryKey(MybatisDemo record);
}