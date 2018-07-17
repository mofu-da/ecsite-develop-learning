package com.example.ecsitedeveloplearning.ec.shop.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ecsitedeveloplearning.ec.shop.model.Product;

@Transactional
@Repository
public interface ShopRepository extends JpaRepository<Product, Integer> {
	
	// ここはDBに Access するためのRepositoryです。
	// JPAを extendsして設定する必要があります。
}
