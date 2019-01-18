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

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 〈一句话功能简述〉<br> 
 * 〈ShowProductController〉
 *
 * @author Administrator
 * @create 2019/1/18
 * @since 1.0.0
 */
@Controller
public class ShowProductController {
    @RequestMapping(value="/showProduct")
    public String showProduct(long productId,long userId){
        return "showProduct";
    }
}