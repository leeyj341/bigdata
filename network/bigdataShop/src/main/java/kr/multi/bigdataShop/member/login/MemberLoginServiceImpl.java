package kr.multi.bigdataShop.member.login;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
@Service
public class MemberLoginServiceImpl implements MemberLoginService {
	@Autowired
	@Qualifier("logindao")
	MemberLoginDAO dao;
	@Override
	public List<LoginDTO> loginInfoList(String id) {
		// TODO Auto-generated method stub
		return dao.loginInfoList(id);
	}

}
