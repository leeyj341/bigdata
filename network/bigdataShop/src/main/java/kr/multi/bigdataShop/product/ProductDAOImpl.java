package kr.multi.bigdataShop.product;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository("productdao")
public class ProductDAOImpl implements ProductDAO {
	@Autowired
	SqlSession sqlSession;
	@Override
	public List<ProductDTO> productlist(String category) {
		String action="";
		System.out.println(category);
		if(category==null) {//전체상품리스트 조회
			action="kr.multi.bigdataShop.product.listall";
		}else{
			action="kr.multi.bigdataShop.product.categorySearch";
		}
		List<ProductDTO> list= sqlSession.selectList(action, category);
		System.out.println(list);
		return list;
	}

	@Override
	public List<ProductDTO> hitproduct() {
		return
		sqlSession.selectList("kr.multi.bigdataShop.product.hitproduct");
	}

	@Override
	public List<ProductDTO> newproduct() {
		return
		sqlSession.selectList("kr.multi.bigdataShop.product.newproduct");
	}

	@Override
	public ProductDTO read(String prd_no) {
		return 
		sqlSession.selectOne("kr.multi.bigdataShop.product.read",prd_no);
	}

}













