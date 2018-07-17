package com.example.ecsitedeveloplearning.ec.shop.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.ecsitedeveloplearning.ec.shop.model.Product;
import com.example.ecsitedeveloplearning.ec.shop.service.ShopService;

@Controller
@RequestMapping(path="/shop")
public class DashboardController {


	/**
	 * ======================= DI ========================
	 */
	@Autowired
	ShopService shopService;

	/**
	 * ======================== 実行メソッド ========================
	 */

	// dashboard画面に全商品表示
	@RequestMapping(value = "/dashboard", method = RequestMethod.GET)
	public ModelAndView viewEmployees() {
		List<Product> products = shopService.findAll();
		System.out.println("test");
		ModelAndView mv = new ModelAndView("shop/dashboard");
		mv.addObject("products", products);
		return mv;
	}

}
