package kr.multi.bigdataShop.product.comment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ProductCommentServiceImpl implements ProductCommentService {
	@Autowired
	@Qualifier("productCommentDAO")
	ProductCommentDAO dao;
	
	@Override
	public List<CommentResultDTO> selectCommentResult() {
		return dao.selectCommentResult();
	}
	
	@Override
	public List<ProductCommentDTO> selectAllComments(String prdNo) {
		return dao.selectAllComments(prdNo);
	}
	
	@Override
	public int insertComment(ProductCommentDTO comment) {
		return dao.insertComment(comment);
	}
}
