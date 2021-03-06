package cn.edu.buaa.rec.dao;

import cn.edu.buaa.rec.model.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface RoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role
     *
     * @mbggenerated Wed Feb 28 00:40:34 CST 2018
     */
    int insert(Role record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role
     *
     * @mbggenerated Wed Feb 28 00:40:34 CST 2018
     */
    int insertSelective(Role record);
    Role selectById(Long id);

    List<Role> selectByProjectId(Long id);
    int checkByNameAndProjectId(@Param("name")String roleName, @Param("projectId")Long projectid);

    Long selectMaxId();

    List<Map<String,Object>> selectNameAndIdByIds(@Param("roleIds")List<Long> roleIds);

    List<Long> selectIdsByName(@Param("roleNames")List<String> roleNames,@Param("projectId")Long projectId);

    List<Map<String,Object>> selectNameAndIdByProjectId(@Param("projectId")Long projectId);
}