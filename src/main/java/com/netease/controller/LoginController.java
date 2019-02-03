/**
 * Copyright (C), 2019-2019
 * FileName: LoginController
 * Author:   Administrator
 * Date:     2019/1/15 14:45
 * Description: LoginController
 * History:
 * <author>          <time>          <version>          <desc>
 * 杜健健           修改时间           版本号              描述
 */
package com.netease.controller;

import com.netease.entity.Product;
import com.netease.entity.User;
import com.netease.mapper.UserMapper;
import com.netease.service.ShowListSerrvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈LoginController〉
 *
 * @author Administrator
 * @create 2019/1/15
 * @since 1.0.0
 */
@Controller
public class LoginController {
    @Autowired
    UserMapper userMapper;
    @Autowired
    ShowListSerrvice showListSerrvice;
    @RequestMapping(value="/login")
    public String Login() {
        return "login"; //没有用ResponseBody，返回string，跳转的是jsp页面："login" + ".jsp"后缀
    }
    @RequestMapping(value="/showlist")
    public String showlist(String name, String pswd, Model model) {
        User user=userMapper.selectUserByName(name);
        if (user==null){
            return "login";
        }
        if (pswd.equals(user.getPswd())){
            model.addAttribute("user",user);
            List<Product> productList=showListSerrvice.showListProduct();
            model.addAttribute("productList",productList);
            if (user.getName().equals("seller")){
                return "showselllist";
            }
            return "showlist";
        }
        return "login";
    }
}