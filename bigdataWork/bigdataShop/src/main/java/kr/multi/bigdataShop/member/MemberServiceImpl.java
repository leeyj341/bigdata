package kr.multi.bigdataShop.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {
	@Autowired
	@Qualifier("memberdao")
	MemberDAO dao;

	@Override
	public MemberDTO login(MemberDTO loginInfo) {
		// TODO Auto-generated method stub
		return dao.login(loginInfo);
	}

	@Override
	public int insert(MemberDTO user) {
		// TODO Auto-generated method stub
		return dao.insert(user);
	}
	

}
