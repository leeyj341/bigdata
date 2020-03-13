package kr.multi.bigdataShop.member.login;

import java.util.List;

public interface MemberLoginService {
	List<LoginDTO> loginInfoList(String id);
}
