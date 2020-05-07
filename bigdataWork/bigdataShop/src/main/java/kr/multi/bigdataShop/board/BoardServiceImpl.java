package kr.multi.bigdataShop.board;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements BoardService{
	@Autowired
	@Qualifier("boarddao")
	BoardDAO dao;
	
	@Override
	public List<BoardDTO> boardList() {
		return dao.boardList();
	}

	@Override
	public List<BoardDTO> searchList(String search) {
		return dao.searchList(search);
	}

	@Override
	public List<BoardDTO> searchList(String tag, String search) {
		return dao.searchList(tag, search);
	}

	
	@Override
	public List<BoardDTO> pageList() {
		return dao.pageList();
	}

	@Override
	public int insert(BoardDTO data,ArrayList<String> filelist) {
		dao.insert(data);
		dao.fileInsert(filelist);
		return 0;
	}
	@Override
	public BoardDTO read(String board_no) {
		// TODO Auto-generated method stub
		return dao.read(board_no);
	}
}
