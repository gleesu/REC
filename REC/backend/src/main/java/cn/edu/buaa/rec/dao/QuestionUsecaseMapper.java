package cn.edu.buaa.rec.dao;

import cn.edu.buaa.rec.model.QuestionUsecase;
import cn.edu.buaa.rec.model.QuestionUsecaseExample;

public interface QuestionUsecaseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_usecase
     *
     * @mbggenerated Tue Feb 27 16:57:54 CST 2018
     */
    int countByExample(QuestionUsecaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_usecase
     *
     * @mbggenerated Tue Feb 27 16:57:54 CST 2018
     */
    int insert(QuestionUsecase record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question_usecase
     *
     * @mbggenerated Tue Feb 27 16:57:54 CST 2018
     */
    int insertSelective(QuestionUsecase record);
}