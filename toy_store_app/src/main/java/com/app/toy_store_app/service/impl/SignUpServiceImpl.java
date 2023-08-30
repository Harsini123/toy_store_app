package com.app.toy_store_app.service.impl;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.app.toy_store_app.model.SignUp;
import com.app.toy_store_app.repository.SignUpRepo;
import com.app.toy_store_app.service.SignUpService;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class SignUpServiceImpl implements SignUpService{
	@Autowired
	private SignUpRepo signupRepository;

	@Override
	public boolean addUser(SignUp signup) {
		boolean userExists = signupRepository.existsByUsermail(signup.getUsermail());
		if(!userExists) {
			signupRepository.save(signup);
			return true;
		} else {
			return false;
		}
	}

	public List<SignUp> getUser() {
		return signupRepository.findAll();
	}

	public boolean updateUser(Long id,SignUp signup) {
		Optional<SignUp> existingUserOptional = signupRepository.findById(id);
		if(existingUserOptional.isPresent()) {
			SignUp userExists = existingUserOptional.get();
			
			userExists.setUsername(signup.getUsername());
			userExists.setUsermail(signup.getUsermail());
			userExists.setMobileno(signup.getMobileno());
			userExists.setPassword(signup.getPassword());
			signupRepository.save(userExists);
			return true;
		} else {
			return false;
		}
		
	}

	@Override
	public boolean deleteUser(Long id) {
		Optional<SignUp> existingUserOptional = signupRepository.findById(id);
		if(existingUserOptional.isPresent()) {
			signupRepository.deleteById(id);
			return true;
		} else {
			return false;
		}
	}
	@Override
	public Page<SignUp> getAllUser(PageRequest pageRequest){
		return signupRepository.findAll(pageRequest);
	}
	@Override
	public List<SignUp> findAllQuery(){
		return signupRepository.findAllQuery();
	}
	@Override
	public SignUp findByUsermail(String usermail) {
		return signupRepository.findByUsermail(usermail);
	}
//
	@Override
	public SignUp findByUsermail() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SignUp findUsermail() {
		// TODO Auto-generated method stub
		return null;
	}

}
