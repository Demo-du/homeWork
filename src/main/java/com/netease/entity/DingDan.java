/**
 * Copyright (C), 2019-2019
 * FileName: DingDan
 * Author:   Administrator
 * Date:     2019/1/28 22:49
 * Description: 订单实体
 * History:
 * <author>          <time>          <version>          <desc>
 * 杜健健           修改时间           版本号              描述
 */
package com.netease.entity;

import java.math.BigDecimal;

/**
 * 〈一句话功能简述〉<br> 
 * 〈订单实体〉
 *
 * @author Administrator
 * @create 2019/1/28
 * @since 1.0.0
 */
public class DingDan {
    Long ID;
    Long userId;
    Long productId;
    BigDecimal price;
    Long sum;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Long getSum() {
        return sum;
    }

    public void setSum(Long sum) {
        this.sum = sum;
    }
}