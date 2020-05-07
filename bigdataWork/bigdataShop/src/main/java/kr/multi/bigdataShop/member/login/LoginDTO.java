package kr.multi.bigdataShop.member.login;

import java.util.Date;

public class LoginDTO {
	int num;
	String id;
	String login_ip;
	Date lastlogintime;
	int count;
	int failcount;
	String block_state;
	Date block_time;
	String block_path;
	String loginoutstate;
	public LoginDTO() {
		
	}
	public LoginDTO(int num,String id, String login_ip, Date lastlogintime, int count, int failcount, String block_state,
			Date block_time, String block_path, String loginoutstate) {
		super();
		this.num = num;
		this.id = id;
		this.login_ip = login_ip;
		this.lastlogintime = lastlogintime;
		this.count = count;
		this.failcount = failcount;
		this.block_state = block_state;
		this.block_time = block_time;
		this.block_path = block_path;
		this.loginoutstate = loginoutstate;
	}
	@Override
	public String toString() {
		return "LoginDTO [num="+num+"id=" + id + ", login_ip=" + login_ip + ", lastlogintime=" + lastlogintime + ", count=" + count
				+ ", failcount=" + failcount + ", block_state=" + block_state + ", block_time=" + block_time
				+ ", block_path=" + block_path + ", loginoutstate=" + loginoutstate + "]";
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLogin_ip() {
		return login_ip;
	}
	public void setLogin_ip(String login_ip) {
		this.login_ip = login_ip;
	}
	public Date getLastlogintime() {
		return lastlogintime;
	}
	public void setLastlogintime(Date lastlogintime) {
		this.lastlogintime = lastlogintime;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getFailcount() {
		return failcount;
	}
	public void setFailcount(int failcount) {
		this.failcount = failcount;
	}
	public String getBlock_state() {
		return block_state;
	}
	public void setBlock_state(String block_state) {
		this.block_state = block_state;
	}
	public Date getBlock_time() {
		return block_time;
	}
	public void setBlock_time(Date block_time) {
		this.block_time = block_time;
	}
	public String getBlock_path() {
		return block_path;
	}
	public void setBlock_path(String block_path) {
		this.block_path = block_path;
	}
	public String getLoginoutstate() {
		return loginoutstate;
	}
	public void setLoginoutstate(String loginoutstate) {
		this.loginoutstate = loginoutstate;
	}
	
}
