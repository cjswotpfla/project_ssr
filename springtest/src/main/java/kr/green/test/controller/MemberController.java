package kr.green.test.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import kr.green.test.vo.MemberVO;
import kr.green.test.service.MemberService;

@Controller
public class MemberController {
	@Autowired
	MemberService memberService;
	
	@GetMapping(value = "/signup")
	public ModelAndView signupGet(ModelAndView mv) {
		mv.setViewName("member/signup");
		return mv;
	}
	/* 매개변수 user를 하면 객체가 생성된 후, 화면에서 전달한 name과 일치하는 값들을 변수명을 가진
	 * 멤버변수의 setter를 이용하여 값을 재설정 
	 * 일반적으로 매개변수는 객체를 자동으로 생성하는건 아님,
	 * */
	@PostMapping(value = "/signup")
	public ModelAndView signupPost(ModelAndView mv, MemberVO user) {
		memberService.signup(user);
		mv.setViewName("redirect:/");
		return mv;
	}
	@GetMapping(value = "/signin")
	public ModelAndView signinGet(ModelAndView mv) {
		mv.setViewName("member/signin");
		return mv;
	}
	@PostMapping(value = "/signin")
	public ModelAndView signinPost(ModelAndView mv, MemberVO user) {
		MemberVO loginUser = memberService.signin(user);
		if(loginUser != null) {
			mv.setViewName("redirect:/");	
		}else {
			mv.setViewName("redirect:/signin");
		}
		mv.addObject("user", loginUser);
		return mv;
	}
	@GetMapping(value = "/mypage")
	public ModelAndView memberMypageGet(ModelAndView mv) {
		mv.setViewName("member/mypage");
		return mv;
	}
	@PostMapping(value = "/mypage")
	public ModelAndView mypagePost(ModelAndView mv, MemberVO user, HttpServletRequest r) {
		MemberVO sessionUser = memberService.getMember(r);
		if(sessionUser != null && sessionUser.getId().equals(user.getId())) {
			MemberVO updatedUser = memberService.updateMember(user);
			if(updatedUser != null) {
				r.getSession().setAttribute("user", updatedUser);
			}
		}
		mv.setViewName("redirect:/member/mypage");
		return mv;
	}
	@RequestMapping(value = "/signout", method = RequestMethod.GET)
	public ModelAndView signoutGet(ModelAndView mv, HttpServletRequest r) {
		r.getSession().removeAttribute("user");
		mv.setViewName("redirect:/");
		return mv;
	}
}