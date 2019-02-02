/**
 * Copyright (C), 2019-2019
 * FileName: Product
 * Author:   Administrator
 * Date:     2019/1/15 15:41
 * Description: 商品实体类
 * History:
 * <author>          <time>          <version>          <desc>
 * 杜健健           修改时间           版本号              描述
 */
package com.netease.entity;

import java.math.BigDecimal;

/**
 * 〈一句话功能简述〉<br> 
 * 〈商品实体类〉
 *
 * @author Administrator
 * @create 2019/1/15
 * @since 1.0.0
 */
public class Product {
    public Long ID;
    public String name;
    public String topic;
    public String picUrl;
    public BigDecimal price;
    public String info;
    public long num;
    public long sellNum;

    public long getSellNum() {
        return sellNum;
    }

    public void setSellNum(long sellNum) {
        this.sellNum = sellNum;
    }

    public long getNum() {
        return num;
    }

    public void setNum(long num) {
        this.num = num;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}