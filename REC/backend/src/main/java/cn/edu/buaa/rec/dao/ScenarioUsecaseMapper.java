package cn.edu.buaa.rec.dao;

import cn.edu.buaa.rec.model.ScenarioUsecase;
import cn.edu.buaa.rec.model.ScenarioUsecaseExample;

public interface ScenarioUsecaseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scenario_usecase
     *
     * @mbggenerated Tue Feb 27 16:57:54 CST 2018
     */
    int countByExample(ScenarioUsecaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scenario_usecase
     *
     * @mbggenerated Tue Feb 27 16:57:54 CST 2018
     */
    int insert(ScenarioUsecase record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scenario_usecase
     *
     * @mbggenerated Tue Feb 27 16:57:54 CST 2018
     */
    int insertSelective(ScenarioUsecase record);
}