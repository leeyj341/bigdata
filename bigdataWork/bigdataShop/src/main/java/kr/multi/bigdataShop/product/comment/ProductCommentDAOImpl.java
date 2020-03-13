package kr.multi.bigdataShop.product.comment;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("productCommentDAO")
public class ProductCommentDAOImpl implements ProductCommentDAO {
	@Autowired
	SqlSession sqlSession;
	
	@Override
	public List<CommentResultDTO> selectCommentResult() {
		return sqlSession.selectList("kr.multi.bigdataShop.product.comment.selectCommentResult");
	}
	
	@Override
	public List<ProductCommentDTO> selectAllComments(String prdNo) {
		return sqlSession.selectList("kr.multi.bigdataShop.product.comment.selectAll", prdNo);
	}
	
	@Override
	public int insertComment(ProductCommentDTO comment) {
		return sqlSession.insert("kr.multi.bigdataShop.product.comment.insertComment", comment);
	}
}
