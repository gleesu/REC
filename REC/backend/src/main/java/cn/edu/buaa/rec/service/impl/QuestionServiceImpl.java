package cn.edu.buaa.rec.service.impl;

import cn.edu.buaa.rec.dao.QuestionMapper;
import cn.edu.buaa.rec.model.Question;
import cn.edu.buaa.rec.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author: suruo
 * @Email: csuruo@gmail.com
 * @Date: Created on 上午1:25 2018/01/25
 * @Modified by:
 */
@Service("QuestionService")
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private QuestionMapper questionMapper;

    @Override
    public boolean newQuestion(Question question) {
        return questionMapper.insert(question) == 1;
    }
}
