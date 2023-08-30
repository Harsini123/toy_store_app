package com.app.toy_store_app.repository;



import org.springframework.data.jpa.repository.JpaRepository;


import com.app.toy_store_app.model.Product;

public interface ProductRepo extends JpaRepository<Product, Long> {

}
