package cn.edu.buaa.rec.dao;

import cn.edu.buaa.rec.model.ActivityExample;
import cn.edu.buaa.rec.model.ActivityWithBLOBs;

public interface ActivityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity
     *
     * @mbggenerated Sun Feb 18 09:09:16 CST 2018
     */
    int countByExample(ActivityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity
     *
     * @mbggenerated Sun Feb 18 09:09:16 CST 2018
     */
    int insert(ActivityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity
     *
     * @mbggenerated Sun Feb 18 09:09:16 CST 2018
     */
    int insertSelective(ActivityWithBLOBs record);
}