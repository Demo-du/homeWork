/**
 * Copyright (C), 2019-2019
 * FileName: User
 * Author:   Administrator
 * Date:     2019/1/14 20:25
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 杜健健           修改时间           版本号              描述
 */
package com.netease.entity;

/**
 * 用户<br>
 * 〈〉
 *
 * @author Administrator
 * @create 2019/1/14
 * @since 1.0.0
 */
public class User {
    public Long ID;
    public String name;
    public String pswd;

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

    public String getPswd() {
        return pswd;
    }

    public void setPswd(String pswd) {
        this.pswd = pswd;
    }
}