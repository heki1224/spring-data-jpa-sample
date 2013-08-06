package com.heki1224.spring_data_jpa_sample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.heki1224.spring_data_jpa_sample.entity.User;
import com.heki1224.spring_data_jpa_sample.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public List<User> getList() {
		return (List<User>) userRepository.findAll();
	}

}
