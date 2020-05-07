package kr.multi.bigdataShop.product.comment;

import java.util.List;

public interface ProductCommentDAO {
	List<CommentResultDTO> selectCommentResult();
	List<ProductCommentDTO> selectAllComments(String prdNo);
	int insertComment(ProductCommentDTO comment);
}
