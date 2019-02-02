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

import com.netease.entity.DingDan;
import com.netease.entity.Product;
import com.netease.mapper.DingDanMapper;
import com.netease.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈JiesuanService〉
 *
 * @author Administrator
 * @create 2019/1/15
 * @since 1.0.0
 */
@Service
public class AddProductToCarSerrvice {
    @Autowired
    DingDanMapper dingDanMapper;
    @Autowired
    ProductMapper productMapper;

    public boolean addProductToCar(long userId,long productId,long num){
                DingDan dingDan=new DingDan();
        dingDan.setUserId(userId);
        dingDan.setSum(num);
        dingDan.setProductId(productId);
        //价格
        List<Product> productList=productMapper.selectProductById(productId);
        if (productList.size()>0){
            dingDan.setPrice(productList.get(0).getPrice());
        }else {
            return false;
        }
        try {
            dingDanMapper.insertDingDan(dingDan);

        }catch (Exception e){
            return false;
        }
        return true;
    }
}