package cn.edu.buaa.rec.dao;

import cn.edu.buaa.rec.model.Domain;
import cn.edu.buaa.rec.model.DomainExample;

public interface DomainMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table domain
     *
     * @mbggenerated Tue Feb 27 16:57:54 CST 2018
     */
    int countByExample(DomainExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table domain
     *
     * @mbggenerated Tue Feb 27 16:57:54 CST 2018
     */
    int insert(Domain record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table domain
     *
     * @mbggenerated Tue Feb 27 16:57:54 CST 2018
     */
    int insertSelective(Domain record);
}