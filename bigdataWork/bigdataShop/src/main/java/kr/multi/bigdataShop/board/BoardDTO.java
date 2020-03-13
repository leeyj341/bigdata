package kr.multi.bigdataShop.board;

import org.springframework.web.multipart.MultipartFile;

public class BoardDTO {
	String board_no;
	String id;
	String title;
	String text;
	int hit;
	String del_flg;
	String reg_dtm;
	String mod_dtm;
	MultipartFile[] files;
	public BoardDTO(){
		
	}
	public BoardDTO(String board_no, String id, String title, String text,
			int hit, String del_flg, String reg_dtm, String mod_dtm) {
		super();
		this.board_no = board_no;
		this.id = id;
		this.title = title;
		this.text = text;
		this.hit = hit;
		this.del_flg = del_flg;
		this.reg_dtm = reg_dtm;
		this.mod_dtm = mod_dtm;
	}
	
	public BoardDTO(String board_no, String id, String title, String text,
			int hit, String del_flg, String reg_dtm, String mod_dtm
			,MultipartFile[] files) {
		super();
		this.board_no = board_no;
		this.id = id;
		this.title = title;
		this.text = text;
		this.hit = hit;
		this.del_flg = del_flg;
		this.reg_dtm = reg_dtm;
		this.mod_dtm = mod_dtm;
		this.files = files;
	}
	public String getBoard_no() {
		return board_no;
	}
	public void setBoard_no(String board_no) {
		System.out.println("setboardno");
		this.board_no = board_no;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		System.out.println("id");
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	public String getDel_flg() {
		return del_flg;
	}
	public void setDel_flg(String del_flg) {
		this.del_flg = del_flg;
	}
	public String getReg_dtm() {
		return reg_dtm;
	}
	public void setReg_dtm(String reg_dtm) {
		this.reg_dtm = reg_dtm;
	}
	public String getMod_dtm() {
		return mod_dtm;
	}
	public void setMod_dtm(String mod_dtm) {
		this.mod_dtm = mod_dtm;
	}
	
	public MultipartFile[] getFiles() {
		return files;
	}
	public void setFiles(MultipartFile[] files) {
		this.files = files;
	}
	@Override
	public String toString() {
		return "BoardVO [board_no=" + board_no + ", id=" + id + ", title="
				+ title + ", text=" + text + ", hit=" + hit + ", del_flg="
				+ del_flg + ", reg_dtm=" + reg_dtm + ", mod_dtm=" + mod_dtm
				+ ", files=" +files + "]";
	}

	
	
}
