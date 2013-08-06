package com.heki1224.spring_data_jpa_sample;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.heki1224.spring_data_jpa_sample.entity.User;
import com.heki1224.spring_data_jpa_sample.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/resources/spring/app-config.xml" })
public class UserServiceTest {

	@Autowired
	private UserService service;

	@Test
	public void testGetList() {
		List<User> list = service.getList();
		System.out.println("List size=" + list.size());
	}
}
