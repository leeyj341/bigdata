package kr.multi.bigdataShop.product.comment;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductCommentController {
	@Autowired
	ProductCommentService service;
	
	@RequestMapping("/comment/result.do")
	public ModelAndView showCommentWordCount() {
		ModelAndView mav = new ModelAndView();
		ArrayList<CommentResultDTO> commentList = (ArrayList<CommentResultDTO>)service.selectCommentResult();
		mav.addObject("commentResult", commentList);
		mav.setViewName("comment/result");
		
		return mav;
	}
	
	@RequestMapping("/product/comment/read.do")
	public ModelAndView showAllComments(String prdNo) {
		ModelAndView mav = new ModelAndView();
		ArrayList<ProductCommentDTO> commentList = (ArrayList<ProductCommentDTO>)service.selectAllComments(prdNo);
		
		mav.addObject("commentlist", commentList);
		mav.setViewName("redirect:/product/read.do?prd_no=" + prdNo);
		
		return mav;
	}
	
	@RequestMapping(value="/product/comment/insert.do", method=RequestMethod.POST)
	public String insertComment(ProductCommentDTO comment) {
		int result = service.insertComment(comment);
		if(result == 1) System.out.println("삽입 성공");
		
		return "redirect:/product/read.do?prd_no=" + comment.getPrd_no();
	}
}
