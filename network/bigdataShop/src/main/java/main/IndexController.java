package main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.multi.bigdataShop.product.ProductDTO;
import kr.multi.bigdataShop.product.ProductService;

@Controller
public class IndexController{
	@Autowired
	ProductService service;
	@RequestMapping("/index.do")
	public ModelAndView main(){
		System.out.println("어노테이션 기반");
		List<ProductDTO> hitProduct = service.hitproduct();
		List<ProductDTO> newProduct = service.newproduct();
		ModelAndView mav = new ModelAndView();
		mav.addObject("hitProduct", hitProduct);
		mav.addObject("newProduct", newProduct);
		System.out.println(hitProduct);
		System.out.println(newProduct);
		mav.setViewName("index");
		return mav;
	}
	@RequestMapping("/admin/index.do")
	public String adminMain(){
		System.out.println("어노테이션 기반");
		return "admin/index";
	}
}
