package kr.multi.bigdataShop.product.comment;

import java.util.List;

public interface ProductCommentService {
	List<CommentResultDTO> selectCommentResult();
	List<ProductCommentDTO> selectAllComments(String prdNo);
	int insertComment(ProductCommentDTO comment);
}
