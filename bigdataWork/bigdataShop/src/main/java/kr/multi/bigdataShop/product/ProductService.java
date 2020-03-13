package kr.multi.bigdataShop.product;

import java.util.List;

public interface ProductService {
	List<ProductDTO> productlist(String category);
	List<ProductDTO> hitproduct();
	List<ProductDTO> newproduct();
	ProductDTO read(String prd_no);
}
