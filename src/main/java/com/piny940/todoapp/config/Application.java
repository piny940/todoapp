package com.piny940.todoapp.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "app")
public class Application {
    
    private String name;
    private String description;
    private Integer hoge;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getHoge() {
        return hoge;
    }
    public void setHoge(Integer hoge) {
        this.hoge = hoge;
    }
}
