package com.qwer.admin.mapper;

import com.qwer.admin.bean.*;
import org.apache.ibatis.annotations.*;

/**
 * @author：cyn
 * @create：2018/12/30 16:19
 * @description：职位实体类mapper接口
 */
//指定这是一个操作数据库的mapper
public interface DepartmentMapper {

    @Select("select * from department where id = #{id}")
    public Department getDeptById(Integer id);

    @Delete("delete from department where id = #{id}")
    public int deleteDeptById(Integer id);

    //指定表的id列为自增主键并自动绑定到pojo
    @Options(useGeneratedKeys = true, keyColumn = "id")
    @Insert("insert into department(departmentName) values(#{departmentName})")
    public int insertDept(Department department);

    @Update("update department set departmentName = #{departmentName} where id = #{id}")
    public int updateDept(Department department);
}