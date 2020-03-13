package kr.multi.bigdataShop.board;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.WebUtils;

@Controller
public class BoardController {
	@Autowired
	BoardService service;
	@Autowired
	FileUploadLogic uploadservice;
	//게시판 검색하기
	@RequestMapping("/board/search2.do")
	public ModelAndView search(@RequestParam("search") String search,
							@RequestParam String tag) {
		ModelAndView mav = new ModelAndView();
		List<BoardDTO> boardlist = service.searchList(tag, search);
		mav.addObject("boardlist", boardlist);
		mav.setViewName("board/main");
		return mav;
	}
	//게시판목록보기
	@RequestMapping("/board/list.do")
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView();
		List<BoardDTO> boardlist = service.boardList();
		mav.addObject("boardlist", boardlist);
		mav.setViewName("board/list");
		return mav;
	}
	//게시글 등록화면보기
	@RequestMapping(value="/board/user/insert.do" ,method=RequestMethod.GET)
	public String showPage() {
		return "board/write";
	}
	//게시글 db에 insert
	@RequestMapping(value="/board/user/insert.do" ,method=RequestMethod.POST)
	public String write(BoardDTO board,HttpServletRequest req) throws Exception{
		System.out.println(board);	
		System.out.println(","+board.getFiles().length);
		MultipartFile[] files = board.getFiles();
		
		//2. 저장될 위치
		String path = 
			WebUtils.getRealPath(req.getSession().getServletContext(),
							"/WEB-INF/upload");
		ArrayList<String> filelist = new ArrayList<String>();
		for (int i = 0; i < files.length; i++) {
			String fileName = files[i].getOriginalFilename();
			if(fileName.length()!=0) {
				filelist.add(fileName);
				System.out.println("file:"+fileName);
				uploadservice.upload(files[i], path, fileName);
			}
		}
		service.insert(board, filelist);
		return "redirect:/board/list.do";
	}
	@RequestMapping(value="/board/user/read.do",method=RequestMethod.GET)
	public ModelAndView read(@RequestParam("board_no") String board_no,@RequestParam("action") String action){
		String view ="";
		System.out.println(board_no);
		if(action.equals("READ")){
			view = "board/read";
		}else{
			view = "board/update";
		}
		BoardDTO board = service.read(board_no);
		return new ModelAndView(view,"board",board);
	}
}






