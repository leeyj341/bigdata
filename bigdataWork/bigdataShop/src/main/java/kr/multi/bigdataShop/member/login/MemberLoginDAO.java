package kr.multi.bigdataShop.member.login;

import java.util.List;

public interface MemberLoginDAO {
	List<LoginDTO> loginInfoList(String id);
}