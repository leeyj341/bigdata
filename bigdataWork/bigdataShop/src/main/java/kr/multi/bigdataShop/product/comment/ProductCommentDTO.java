package kr.multi.bigdataShop.product.comment;

public class ProductCommentDTO {
	private String prd_no;
	private String mem_id;
	private String pro_comment;
	private String writedate;
	
	public ProductCommentDTO() {
		// TODO Auto-generated constructor stub
	}

	public ProductCommentDTO(String prd_no, String mem_id, String pro_comment, String writedate) {
		super();
		this.prd_no = prd_no;
		this.mem_id = mem_id;
		this.pro_comment = pro_comment;
		this.writedate = writedate;
	}

	public String getPrd_no() {
		return prd_no;
	}

	public void setPrd_no(String prd_no) {
		this.prd_no = prd_no;
	}

	public String getMem_id() {
		return mem_id;
	}

	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}

	public String getPro_comment() {
		return pro_comment;
	}

	public void setPro_comment(String pro_comment) {
		this.pro_comment = pro_comment;
	}

	public String getWritedate() {
		return writedate;
	}

	public void setWritedate(String writedate) {
		this.writedate = writedate;
	}
	
	
}
