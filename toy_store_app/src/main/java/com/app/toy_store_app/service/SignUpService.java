package com.app.toy_store_app.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.app.toy_store_app.model.SignUp;

public interface SignUpService {
	public boolean addUser(SignUp signup);
	public List<SignUp> getUser();
	public boolean updateUser(Long id, SignUp signup);
	public boolean deleteUser(Long id);
	public Page<SignUp> getAllUser(PageRequest pageRequest);
	List<SignUp> findAllQuery();
	
	public SignUp findUsermail();
	SignUp findByUsermail(String usermail);
	SignUp findByUsermail();
}
