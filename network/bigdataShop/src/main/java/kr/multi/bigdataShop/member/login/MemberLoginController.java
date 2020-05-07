package kr.multi.bigdataShop.member.login;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MemberLoginController {
	@Autowired
	MemberLoginService service;
	//게시판목록보기
	@RequestMapping("/loginInfo/list.do")
	public ModelAndView list(String id) {
		ModelAndView mav = new ModelAndView();
		List<LoginDTO> loginInfoList = service.loginInfoList(id);
		System.out.println(loginInfoList);
		mav.addObject("loginInfoList", loginInfoList);
		mav.setViewName("member/mypage");
		return mav;
	}
}
