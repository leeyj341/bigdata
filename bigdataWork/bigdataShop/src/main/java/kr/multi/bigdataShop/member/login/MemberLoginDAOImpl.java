package kr.multi.bigdataShop.member.login;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository("logindao")
public class MemberLoginDAOImpl implements MemberLoginDAO {
	@Autowired
	SqlSession sqlsession;

	@Override
	public List<LoginDTO> loginInfoList(String id) {
		return sqlsession.selectList("kitri.shop.member.login.loginlist",id);
	}
	

}
