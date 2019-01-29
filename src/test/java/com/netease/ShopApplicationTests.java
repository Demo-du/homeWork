package com.netease;

import com.netease.entity.DingDan;
import com.netease.entity.Product;
import com.netease.entity.User;
import com.netease.mapper.DingDanMapper;
import com.netease.mapper.ProductMapper;
import com.netease.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

//@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@RunWith(SpringRunner.class)
@SpringBootTest
public class ShopApplicationTests {
    @Autowired
	UserMapper userMapper;
    @Autowired
	ProductMapper productMapper;
    @Autowired
	DingDanMapper dingDanMapper;
	@Test
	public void contextLoads() {
		List<DingDan> dingDanList=dingDanMapper.selectDingDanById(1l);
		System.out.println(dingDanList.get(0).getPrice());
	}

}

