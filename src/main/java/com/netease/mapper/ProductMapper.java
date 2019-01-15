/**
 * Copyright (C), 2019-2019
 * FileName: UserMapper
 * Author:   Administrator
 * Date:     2019/1/14 21:05
 * Description: usermapper
 * History:
 * <author>          <time>          <version>          <desc>
 * 杜健健           修改时间           版本号              描述
 */
package com.netease.mapper;

import com.netease.entity.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈Productmapper〉
 *
 * @author Administrator
 * @create 2019/1/14
 * @since 1.0.0
 */

@Mapper
public interface ProductMapper {
    List<Product> selectAll();
}