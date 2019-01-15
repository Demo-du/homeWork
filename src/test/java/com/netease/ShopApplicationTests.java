package com.netease;

import com.netease.entity.User;
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
	@Test
	public void contextLoads() {
		List<User> list=userMapper.selectAll();
		System.out.println(list.get(0).getName());
	}

}
