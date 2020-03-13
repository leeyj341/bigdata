package kr.multi.bigdataShop.member;


public interface MemberDAO {
	MemberDTO login(MemberDTO loginInfo);
	int insert(MemberDTO user);
}