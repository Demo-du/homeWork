/**
 * Copyright (C), 2019-2019
 * FileName: ShowProductController
 * Author:   Administrator
 * Date:     2019/1/18 19:34
 * Description: ShowProductController
 * History:
 * <author>          <time>          <version>          <desc>
 * 杜健健           修改时间           版本号              描述
 */
package com.netease.controller;

import com.netease.entity.Product;
import com.netease.mapper.UserMapper;
import com.netease.service.JieSuanSerrvice;
import com.netease.service.ShowCarSerrvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.math.BigDecimal;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈ShowCarController〉
 *
 * @author Administrator
 * @create 2019/1/18
 * @since 1.0.0
 */
@Controller
public class JieSuanController {
    @Autowired
    UserMapper userMapper;
    @Autowired
    JieSuanSerrvice jieSuanSerrvice;
    @RequestMapping(value="/jiesuan")
    public String showCar(long userId,Model model){
        BigDecimal priceSum=jieSuanSerrvice.getPriceSum(userId);
        model.addAttribute("priceSum",priceSum);
        model.addAttribute("user",userMapper.selectUserById(userId));
        return "jiesuan";
    }
}