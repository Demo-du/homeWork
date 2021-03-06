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

import java.math.BigDecimal;
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
		//List<DingDan> dingDanList=dingDanMapper.selectDingDanByUserIdAndProductId(1l,1l);
		//System.out.println(dingDanList.get(0).getPrice());
		DingDan dingDan=new DingDan();
		dingDan.setPrice(new BigDecimal(0));
		dingDan.setProductId(1L);
		dingDan.setSum(888l);
		dingDan.setUserId(1l);
		dingDan.setID(3l);
		dingDanMapper.deleteDingDan(3l);
	}

}

