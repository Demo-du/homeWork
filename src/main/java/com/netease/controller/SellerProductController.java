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
import com.netease.mapper.ProductMapper;
import com.netease.mapper.UserMapper;
import com.netease.service.ShowListSerrvice;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈SellerProductController〉
 *
 * @author Administrator
 * @create 2019/1/15
 * @since 1.0.0
 */
@Controller
public class SellerProductController {
    @Autowired
    ProductMapper productMapper;
    @ResponseBody
    @RequestMapping(value="/delProductPage")
    public String delProductPage(long productId, Model model) {
        try {
            productMapper.deleteProduct(productId);
        }catch (Exception e){
            return "删除失败";
        }
       // model.addAttribute("product",productList.get(0));
        return "已删除"; //没有用ResponseBody，返回string，跳转的是jsp页面："login" + ".jsp"后缀
    }
    @RequestMapping(value="/changeProductPage")
    public String changeProductPage(long productId, Model model) {
        List<Product> productList=productMapper.selectProductById(productId);
        model.addAttribute("product",productList.get(0));
        return "changeProductPage"; //没有用ResponseBody，返回string，跳转的是jsp页面："login" + ".jsp"后缀
    }
    @ResponseBody
    @RequestMapping(value="/changeProduct")
    public String changeProduct(Product product, Model model) {
        try {
            productMapper.updateProduct(product);
        }catch (Exception e){
            return "修改失败";
        }
        return "修改成功"; //没有用ResponseBody，返回string，跳转的是jsp页面："login" + ".jsp"后缀
    }
    //@ResponseBody
    @RequestMapping(value="/addProductPage")
    public String addProductPage() {

        return "addProductPage"; //没有用ResponseBody，返回string，跳转的是jsp页面："login" + ".jsp"后缀
    }
    @ResponseBody
    @RequestMapping(value="/addProduct")
    public String addProduct(Product product, Model model) {
        try {
            productMapper.insertProduct(product);
        }catch (Exception e){
            return "添加失败";
        }
        return "添加成功"; //没有用ResponseBody，返回string，跳转的是jsp页面："login" + ".jsp"后缀
    }
}