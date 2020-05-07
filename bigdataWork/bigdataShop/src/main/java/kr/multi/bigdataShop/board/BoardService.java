package kr.multi.bigdataShop.board;

import java.util.ArrayList;
import java.util.List;

public interface BoardService {
	List<BoardDTO> boardList();
	List<BoardDTO> searchList(String search);
	List<BoardDTO> searchList(String tag,String search);
	List<BoardDTO> pageList();
	int insert(BoardDTO data,ArrayList<String> filelist) ;
	BoardDTO read(String board_no);
}
