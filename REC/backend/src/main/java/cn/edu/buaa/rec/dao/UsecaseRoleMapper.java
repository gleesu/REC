package cn.edu.buaa.rec.dao;

import cn.edu.buaa.rec.model.UsecaseRole;
import cn.edu.buaa.rec.model.UsecaseRoleExample;

public interface UsecaseRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usecase_role
     *
     * @mbggenerated Tue Feb 27 16:57:55 CST 2018
     */
    int countByExample(UsecaseRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usecase_role
     *
     * @mbggenerated Tue Feb 27 16:57:55 CST 2018
     */
    int insert(UsecaseRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usecase_role
     *
     * @mbggenerated Tue Feb 27 16:57:55 CST 2018
     */
    int insertSelective(UsecaseRole record);
}