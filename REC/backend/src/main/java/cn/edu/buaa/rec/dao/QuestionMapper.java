package cn.edu.buaa.rec.dao;

import cn.edu.buaa.rec.model.Question;
import cn.edu.buaa.rec.model.QuestionExample;

public interface QuestionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbggenerated Tue Feb 27 16:57:54 CST 2018
     */
    int countByExample(QuestionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbggenerated Tue Feb 27 16:57:54 CST 2018
     */
    int insert(Question record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbggenerated Tue Feb 27 16:57:54 CST 2018
     */
    int insertSelective(Question record);
}