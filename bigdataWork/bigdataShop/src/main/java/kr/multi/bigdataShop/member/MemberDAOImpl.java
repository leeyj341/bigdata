package kr.multi.bigdataShop.member;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("memberdao")
public class MemberDAOImpl implements MemberDAO {
	@Autowired
	SqlSession sqlsession;

	@Override
	public MemberDTO login(MemberDTO loginInfo) {
		// TODO Auto-generated method stub
		System.out.println("dao:"+loginInfo);
		MemberDTO result = 
				sqlsession.selectOne("kitri.shop.member.login", loginInfo);
		System.out.println("result===>"+result);
		return result;
	}

	@Override
	public int insert(MemberDTO user) {
		int result=sqlsession.insert("kitri.shop.member.memInsert",user);
		return result;
	}


}
