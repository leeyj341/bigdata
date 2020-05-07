package kr.multi.bigdataShop.product;

public class ProductDTO {
	
	public String prd_no;
	public String prd_nm;
	public String category_no;
	public String prd_des;
	public int sell_prc_unit;
	public String sell_start_dt;
	public String sell_end_dt;
	public String dlv_constraint;
	public String as_flg;
	public String return_flg;
	public String img_org_file_nm;
	public String img_gen_file_nm;
	public String reg_id;
	public String reg_dtm;
	
	public ProductDTO(){
		
	}
	
	@Override
	public String toString() {
		return "ProductDTO [prd_no=" + prd_no + ", prd_nm=" + prd_nm + ", category_no=" + category_no + ", prd_des="
				+ prd_des + ", sell_prc_unit=" + sell_prc_unit + ", sell_start_dt=" + sell_start_dt + ", sell_end_dt="
				+ sell_end_dt + ", dlv_constraint=" + dlv_constraint + ", as_flg=" + as_flg + ", return_flg="
				+ return_flg + ", img_org_file_nm=" + img_org_file_nm + ", img_gen_file_nm=" + img_gen_file_nm
				+ ", reg_id=" + reg_id + ", reg_dtm=" + reg_dtm + "]";
	}

	
	public ProductDTO(String prd_no, String prd_nm, String img_gen_file_nm) {
		super();
		this.prd_no = prd_no;
		this.prd_nm = prd_nm;
		this.img_gen_file_nm = img_gen_file_nm;
	}

	public ProductDTO(String prd_no, String prd_nm, String category_no, String prd_des, int sell_prc_unit,
			String sell_start_dt, String sell_end_dt, String dlv_constraint, String as_flg, String return_flg,
			String img_org_file_nm, String img_gen_file_nm, String reg_id, String reg_dtm) {
		super();
		this.prd_no = prd_no;
		this.prd_nm = prd_nm;
		this.category_no = category_no;
		this.prd_des = prd_des;
		this.sell_prc_unit = sell_prc_unit;
		this.sell_start_dt = sell_start_dt;
		this.sell_end_dt = sell_end_dt;
		this.dlv_constraint = dlv_constraint;
		this.as_flg = as_flg;
		this.return_flg = return_flg;
		this.img_org_file_nm = img_org_file_nm;
		this.img_gen_file_nm = img_gen_file_nm;
		this.reg_id = reg_id;
		this.reg_dtm = reg_dtm;
	}

	public String getPrd_no() {
		return prd_no;
	}

	public void setPrd_no(String prd_no) {
		this.prd_no = prd_no;
	}

	public String getPrd_nm() {
		return prd_nm;
	}

	public void setPrd_nm(String prd_nm) {
		this.prd_nm = prd_nm;
	}

	public String getCategory_no() {
		return category_no;
	}

	public void setCategory_no(String category_no) {
		this.category_no = category_no;
	}

	public String getPrd_des() {
		return prd_des;
	}

	public void setPrd_des(String prd_des) {
		this.prd_des = prd_des;
	}

	public int getSell_prc_unit() {
		return sell_prc_unit;
	}

	public void setSell_prc_unit(int sell_prc_unit) {
		this.sell_prc_unit = sell_prc_unit;
	}

	public String getSell_start_dt() {
		return sell_start_dt;
	}

	public void setSell_start_dt(String sell_start_dt) {
		this.sell_start_dt = sell_start_dt;
	}

	public String getSell_end_dt() {
		return sell_end_dt;
	}

	public void setSell_end_dt(String sell_end_dt) {
		this.sell_end_dt = sell_end_dt;
	}

	public String getDlv_constraint() {
		return dlv_constraint;
	}

	public void setDlv_constraint(String dlv_constraint) {
		this.dlv_constraint = dlv_constraint;
	}

	public String getAs_flg() {
		return as_flg;
	}

	public void setAs_flg(String as_flg) {
		this.as_flg = as_flg;
	}

	public String getReturn_flg() {
		return return_flg;
	}

	public void setReturn_flg(String return_flg) {
		this.return_flg = return_flg;
	}

	public String getImg_org_file_nm() {
		return img_org_file_nm;
	}

	public void setImg_org_file_nm(String img_org_file_nm) {
		this.img_org_file_nm = img_org_file_nm;
	}

	public String getImg_gen_file_nm() {
		return img_gen_file_nm;
	}

	public void setImg_gen_file_nm(String img_gen_file_nm) {
		this.img_gen_file_nm = img_gen_file_nm;
	}

	public String getReg_id() {
		return reg_id;
	}

	public void setReg_id(String reg_id) {
		this.reg_id = reg_id;
	}

	public String getReg_dtm() {
		return reg_dtm;
	}

	public void setReg_dtm(String reg_dtm) {
		this.reg_dtm = reg_dtm;
	}
}
