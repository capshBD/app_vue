package com.sunway.vue.controller;

import com.sunway.vue.domain.VueDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.UUID;

/**
 * @program: app_vue
 * @Date: 2019/11/9 21:12
 * @Author: Mr.Cheng
 * @Description:
 */
@Controller
@RequestMapping("/thyme-leaf")
public class ThymeLeafController extends BaseController{

    @RequestMapping("/test1")
    public String sendVariable(ModelMap map){
        map.addAttribute("information", "ThymeLeaf模板接收到的后端变量");
        return "thymeleaf/html/test";
    }

    @RequestMapping("/test2")
    public String sendSessionInfo(){
        VueDTO vueDTO=new VueDTO();
        vueDTO.setId(UUID.randomUUID().toString());
        vueDTO.setVueName("vue学习名称");
        vueDTO.setVueSeful("蛤蛤是这样");
        vueDTO.setVueStrange("strange下班AFG");
        setSessionAttribute("vue",vueDTO);
        return "thymeleaf/html/test";
    }
}
