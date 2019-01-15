/**
 * Copyright (C), 2019-2019
 * FileName: ShowListSerrvice
 * Author:   Administrator
 * Date:     2019/1/15 21:10
 * Description: ShowListService
 * History:
 * <author>          <time>          <version>          <desc>
 * 杜健健           修改时间           版本号              描述
 */
package com.netease.service;

import com.netease.entity.Product;
import com.netease.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈ShowListService〉
 *
 * @author Administrator
 * @create 2019/1/15
 * @since 1.0.0
 */
@Service
public class ShowListSerrvice {
    @Autowired
    ProductMapper productMapper;
    public List<Product> showListProduct(){
        List<Product> list=productMapper.selectAll();
        return list;
    }
}