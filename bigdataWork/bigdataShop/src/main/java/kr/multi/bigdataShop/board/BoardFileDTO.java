package kr.multi.bigdataShop.board;

public class BoardFileDTO {
	String board_no;
	String file_name;
	public BoardFileDTO(){
		
	}
	public BoardFileDTO(String board_no, String file_name) {
		super();
		this.board_no = board_no;
		this.file_name = file_name;
	}
	@Override
	public String toString() {
		return "BoardFileVO [board_no=" + board_no + ", file_name=" + file_name
				+ "]";
	}
	public String getBoard_no() {
		return board_no;
	}
	public void setBoard_no(String board_no) {
		this.board_no = board_no;
	}
	public String getFile_name() {
		return file_name;
	}
	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}
	
}
