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

    @GetMapping("/v-bind")//v-bind绑定元素属性
    public String vueBindOrderPage(){
        return "vue/html/vueBindOrder";
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

    @GetMapping("/filter")//属性值过滤
    public String testFilter(){
        return "vue/html/vueFilters";
    }

    @GetMapping("/comp")//组件
    public String testComp(){
        return "vue/html/vueComponent";
    }

    @GetMapping("/example-comp")//留言板组件
    public String testExampleComp(){
        return "vue/html/vueExampleComp";
    }

    @GetMapping("/comp-life")//组件
    public String testCompLife(){
        return "vue/html/vueCompLife";
    }

    @GetMapping("/comp-data-interactive")//父子组件数据交互
    public String testInteractive(){
        return "vue/html/vueCompDataInteractive";
    }

    @GetMapping("/comp-data-interactive-example")//父子组件数据交互参数组件
    public String testInteractiveExample(){
        return "vue/html/vueCompDataInteractiveExample";
    }

    @GetMapping("/comp-place-holder")//组件参数默认提示值
    public String testComPlaceHolder(){
        return "vue/html/vueComPlaceholder";
    }

    @GetMapping("/comp-place-swaper")//父子组件共享数据
    public String testCompSwaper(){
        return "vue/html/vueCompSwaper";
    }

    @GetMapping("/comp-msg")//父子组件调用监听函数
    public String testCompMsg(){
        return "vue/html/vueCompMsg";
    }
}
