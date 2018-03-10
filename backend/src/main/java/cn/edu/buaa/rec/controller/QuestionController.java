package cn.edu.buaa.rec.controller;

import cn.edu.buaa.rec.model.Question;
import cn.edu.buaa.rec.service.QuestionService;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Map;

/**
 * @Description:
 * @Author: suruo
 * @Email: csuruo@gmail.com
 * @Date: Created on 上午1:30 2018/01/25
 * @Modified by:
 */

@RestController
@RequestMapping("/question")
//@EnableAutoConfiguration
public class QuestionController {
    @Autowired
    @Qualifier("QuestionService")
    private QuestionService questionService;

    /**
     * 新建问题
     *
     * @param info
     * @return
     */
    @RequestMapping(value = "/new", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> newQuestion(@Valid @RequestBody Map<String, Object> info) {

        JSONObject jsonObject = (JSONObject) JSONObject.toJSON(info);
        Question question = new Question(jsonObject.getString("title"), jsonObject.getString("content"), jsonObject.getLong("creatorId"), jsonObject.getLong("projectId"), jsonObject.getInteger("type"));

        System.out.println(question.toString());

        return questionService.newQuestion(question);
    }

    /**
     * 老的添加问题接口，废弃
     *
     * @param questionId
     * @return
     */
    @RequestMapping(value = "/add", method = {RequestMethod.GET})
    @ResponseBody
    public Map<String, Object> newQuestion1(@RequestParam("id") long questionId) {

        Question question = new Question();
        question.setId(questionId);
        return questionService.newQuestion(question);
    }
}
