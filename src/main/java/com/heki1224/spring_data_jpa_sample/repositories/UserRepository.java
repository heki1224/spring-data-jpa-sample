package com.heki1224.spring_data_jpa_sample.repositories;

import org.springframework.data.repository.CrudRepository;

import com.heki1224.spring_data_jpa_sample.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
