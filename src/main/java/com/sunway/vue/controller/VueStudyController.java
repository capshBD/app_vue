package com.sunway.vue.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: app_vue
 * @Date: 2019/11/8 10:43
 * @Author: Mr.Cheng
 * @Description:
 */
@Controller
@RequestMapping("/vue")
public class VueStudyController {

    @GetMapping("/helloWorld")
    /**
     * @Description
     * @date 2019/11/8
      * @param
     * @return java.lang.String
     * 从classpath下的templates下级目录开始找,不能包含"/"
     */
    public String testHelloWord(){
        return "vue/html/index";
    }

    @GetMapping("/order")//指令
    public String testOrder(){
        return "vue/html/vueOrder";
    }

    @GetMapping("/example")//留言板例子
    public String testExample(){
        return "vue/html/example";
    }

    @GetMapping("/event")//事件
    public String testEvent(){
        return "vue/html/vueEvent";
    }

    @GetMapping("/page")//分页例子
    public String testPage(){
        return "vue/html/vuePage";
    }

    @GetMapping("/model")//v-model属性
    public String testModel(){
        return "vue/html/vueModel";
    }

    @GetMapping("/custom")//自定义指令
    public String testCustom(){
        return "vue/html/vueCustomOrder";
    }

    @GetMapping("/computed")//动态设置属性
    public String testComputed(){
        return "vue/html/vueDymicAttr";
    }
}
