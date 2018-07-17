package com.example.ecsitedeveloplearning.ec.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.ecsitedeveloplearning.ec.shop.model.Product;
import com.example.ecsitedeveloplearning.ec.shop.repository.ShopRepository;


@Service
public class ShopService {
	
	/**=======================
	 * DI
	 *========================*/
	@Autowired
	ShopRepository shopRepository;

	public List<Product> findAll() {
		return shopRepository.findAll();
	}


}
