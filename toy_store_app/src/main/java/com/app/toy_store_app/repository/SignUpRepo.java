package com.app.toy_store_app.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.app.toy_store_app.model.SignUp;

public interface SignUpRepo extends JpaRepository<SignUp, Long>{
boolean existsByUsermail(String usermail);
	
	Optional<SignUp> findById(Long id);
	
	void deleteById(Long id);
    @Query("select s from SignUp s")
    List<SignUp> findAllQuery();
    @Query("select s from SignUp s where s.usermail= :usermail")
	SignUp findByUsermail(@Param("usermail")String usermail);
}
