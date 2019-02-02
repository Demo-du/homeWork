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

import com.netease.mapper.UserMapper;
import com.netease.service.AddProductToCarSerrvice;
import com.netease.service.JieSuanSerrvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.math.BigDecimal;

/**
 * 〈一句话功能简述〉<br> 
 * 〈ShowCarController〉
 *
 * @author Administrator
 * @create 2019/1/18
 * @since 1.0.0
 */
@Controller
public class AddProductToCarController {
    @Autowired
    UserMapper userMapper;
    @Autowired
    AddProductToCarSerrvice addProductToCarSerrvice;
    @ResponseBody
    @RequestMapping(value="/addProductToCar")
    public String showCar(long userId,long productId,long productNum,Model model){
        boolean beSuccess=addProductToCarSerrvice.addProductToCar(userId,productId,productNum);
        if (beSuccess){
            return "添加成功";
        }
        return "添加失败";
    }
}