package kr.multi.bigdataShop.board;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository("boarddao")
public class BoardDAOImpl implements BoardDAO {
	@Autowired
	SqlSession sqlSession;
	@Override
	public List<BoardDTO> boardList() {
		return sqlSession.selectList("bigdataShop.board.list");
	}

	@Override
	public List<BoardDTO> searchList(String search) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BoardDTO> searchList(String tag, String search) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("tag",tag);
		map.put("search",search);
		List<BoardDTO> searchList =
		 sqlSession.selectList("bigdataShop.board.dynamicSearch",map);
		System.out.println(searchList);
		return searchList;			
	}

	@Override
	public List<BoardDTO> pageList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(BoardDTO data) {
		int main = sqlSession.insert("bigdataShop.board.insert",data);
		return main;
	}

	@Override
	public int fileInsert(ArrayList<String> filelist) {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("filelist",filelist);
		System.out.println("mybatis:"+paramMap);
		int sub = 
			sqlSession.insert("bigdataShop.board.fileinsert",paramMap);
		return sub;
	}
	@Override
	public BoardDTO read(String board_no) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("bigdataShop.board.read", board_no);
	}
}











