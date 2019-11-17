package com.sunway.vue.domain;

/**
 * @program: app_vue
 * @Date: 2019/11/9 21:28
 * @Author: Mr.Cheng
 * @Description:
 */
public class VueDTO {
    private String id;
    private String vueName;
    private String vueStrange;
    private String vueSeful;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVueName() {
        return vueName;
    }

    public void setVueName(String vueName) {
        this.vueName = vueName;
    }

    public String getVueStrange() {
        return vueStrange;
    }

    public void setVueStrange(String vueStrange) {
        this.vueStrange = vueStrange;
    }

    public String getVueSeful() {
        return vueSeful;
    }

    public void setVueSeful(String vueSeful) {
        this.vueSeful = vueSeful;
    }
}
