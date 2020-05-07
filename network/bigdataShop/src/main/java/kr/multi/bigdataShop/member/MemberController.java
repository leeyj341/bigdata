package kr.multi.bigdataShop.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MemberController {
	@Autowired
	MemberService service;
	@RequestMapping(value = "/member/login", method = RequestMethod.GET)
	public String login(){
		return "member/login";
	}
	@RequestMapping(value = "/member/mypage", method = RequestMethod.GET)
	public String mypage(){
		return "member/mypage";
	}
	@RequestMapping(value = "/member/logout", method = RequestMethod.GET)
	public String logout(HttpServletRequest req){
		HttpSession session = req.getSession(false);
		session.invalidate();
		return "member/login";
	}
	@RequestMapping(value = "/member/login", method = RequestMethod.POST)
	public String login(MemberDTO loginInfo,HttpServletRequest req){
		HttpSession session = req.getSession();
		MemberDTO loginUser = service.login(loginInfo);
		session.setAttribute("loginUser", loginUser);
		return "redirect:/loginInfo/list.do?id="+loginUser.getMem_id();
	}
	@RequestMapping(value = "/member/insert.do", method = RequestMethod.GET)
	public String insert(){
		return "member/insert";
	}
	@RequestMapping(value = "/member/insert.do", method = RequestMethod.POST)
	public String insert(MemberDTO user){
		System.out.println(user);
		service.insert(user);	
		return "redirect:/index.do";
	}
}











