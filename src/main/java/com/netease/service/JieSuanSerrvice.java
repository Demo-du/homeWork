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
public class JieSuanSerrvice {
    @Autowired
    DingDanMapper dingDanMapper;
    @Autowired
    ProductMapper productMapper;
    public BigDecimal getPriceSum(Long userId){
        List<DingDan> dingDanList=dingDanMapper.selectDingDanByUserId(userId);
        List<Product> productList=new ArrayList<>();
        BigDecimal priceSum=new BigDecimal(0);
        for (DingDan dingDan:dingDanList){
            Product product=null;//=new Product();
            long productId=dingDan.getProductId();
            if (productMapper.selectProductById(productId)!=null){
                product=productMapper.selectProductById(productId).get(0);
            }
            if (product!=null){
                product.setNum(dingDan.getSum());
                productList.add(product);
            }
        }
        for (Product productTmp:productList){
            BigDecimal numTmp=new BigDecimal(productTmp.getNum());
            BigDecimal priceTmp=productTmp.getPrice().multiply(numTmp);
            priceSum=priceSum.add(priceTmp);
        }
        return priceSum;
    }
}