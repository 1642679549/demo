package com.xiaoma.demo.domain;

import java.io.Serializable;

public class Random implements Serializable {
    private Long id;

    /**
    * 随机数范围
    */
    private Integer randNum;

    /**
    * 限制数字
    */
    private Integer restrict;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getRandNum() {
        return randNum;
    }

    public void setRandNum(Integer randNum) {
        this.randNum = randNum;
    }

    public Integer getRestrict() {
        return restrict;
    }

    public void setRestrict(Integer restrict) {
        this.restrict = restrict;
    }
}