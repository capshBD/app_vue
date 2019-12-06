package com.sunway.vue.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: app_vue
 * @Date: 2019/12/2 17:57
 * @Author: Mr.Cheng
 * @Description:
 */
@Controller
@RequestMapping("/view")
public class VueViewController {

    @GetMapping
    @RequestMapping("/demo")
    public String testViewDemo() {
        return "vue/iview/iviewDemo";
    }
}
