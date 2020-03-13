package kr.multi.bigdataShop.member;

public class MemberDTO {

	String mem_id;
	String mem_nm;
	String mem_cd;
	String pwd;
	String pwd_hint;
	String pwd_hint_ans;
	String ssn;
	String birth_dt;
	String male_flg;
	String tel_no;
	String cell_no;
	String addr;
	String email;
	String email_rcv_flg;
	String mem_reg_dtm;
	
	public MemberDTO() {
		// TODO Auto-generated constructor stub
	}

	public MemberDTO(String mem_id, String mem_nm, String mem_cd, String pwd,
			String pwd_hint, String pwd_hint_ans, String ssn, String birth_dt,
			String male_flg, String tel_no, String cell_no, String addr,
			String email, String email_rcv_flg, String mem_reg_dtm) {
		super();
		this.mem_id = mem_id;
		this.mem_nm = mem_nm;
		this.mem_cd = mem_cd;
		this.pwd = pwd;
		this.pwd_hint = pwd_hint;
		this.pwd_hint_ans = pwd_hint_ans;
		this.ssn = ssn;
		this.birth_dt = birth_dt;
		this.male_flg = male_flg;
		this.tel_no = tel_no;
		this.cell_no = cell_no;
		this.addr = addr;
		this.email = email;
		this.email_rcv_flg = email_rcv_flg;
		this.mem_reg_dtm = mem_reg_dtm;
	}
	
	public MemberDTO(String mem_id, String pwd) {
		super();
		this.mem_id = mem_id;
		this.pwd = pwd;
	}

	public String getMem_id() {
		return mem_id;
	}

	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}

	public String getMem_nm() {
		return mem_nm;
	}

	public void setMem_nm(String mem_nm) {
		this.mem_nm = mem_nm;
	}

	public String getMem_cd() {
		return mem_cd;
	}

	public void setMem_cd(String mem_cd) {
		this.mem_cd = mem_cd;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getPwd_hint() {
		return pwd_hint;
	}

	public void setPwd_hint(String pwd_hint) {
		this.pwd_hint = pwd_hint;
	}

	public String getPwd_hint_ans() {
		return pwd_hint_ans;
	}

	public void setPwd_hint_ans(String pwd_hint_ans) {
		this.pwd_hint_ans = pwd_hint_ans;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getBirth_dt() {
		return birth_dt;
	}

	public void setBirth_dt(String birth_dt) {
		this.birth_dt = birth_dt;
	}

	public String getMale_flg() {
		return male_flg;
	}

	public void setMale_flg(String male_flg) {
		this.male_flg = male_flg;
	}

	public String getTel_no() {
		return tel_no;
	}

	public void setTel_no(String tel_no) {
		this.tel_no = tel_no;
	}

	public String getCell_no() {
		return cell_no;
	}

	public void setCell_no(String cell_no) {
		this.cell_no = cell_no;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail_rcv_flg() {
		return email_rcv_flg;
	}

	public void setEmail_rcv_flg(String email_rcv_flg) {
		this.email_rcv_flg = email_rcv_flg;
	}

	public String getMem_reg_dtm() {
		return mem_reg_dtm;
	}

	public void setMem_reg_dtm(String mem_reg_dtm) {
		this.mem_reg_dtm = mem_reg_dtm;
	}

	@Override
	public String toString() {
		return "LoginVO [mem_id=" + mem_id + ", mem_nm=" + mem_nm + ", mem_cd="
				+ mem_cd + ", pwd=" + pwd + ", pwd_hint=" + pwd_hint
				+ ", pwd_hint_ans=" + pwd_hint_ans + ", ssn=" + ssn
				+ ", birth_dt=" + birth_dt + ", male_flg=" + male_flg
				+ ", tel_no=" + tel_no + ", cell_no=" + cell_no + ", addr="
				+ addr + ", email=" + email + ", email_rcv_flg="
				+ email_rcv_flg + ", mem_reg_dtm=" + mem_reg_dtm + "]";
	}
	
}
