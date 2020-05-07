package kr.multi.bigdataShop.member;


public interface MemberService {
	MemberDTO login(MemberDTO loginInfo);
	int insert(MemberDTO user);
}
