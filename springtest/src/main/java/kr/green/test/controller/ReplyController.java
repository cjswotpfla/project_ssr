package kr.green.test.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import kr.green.test.service.MemberService;
import kr.green.test.service.ReplyService;
import kr.green.test.vo.ReplyVO;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class ReplyController {
	
	ReplyService replyService;
	MemberService memberService;
	
	@PostMapping("/reply/ins")
	public String repInsertPost(@RequestBody ReplyVO reply) {
		
		System.out.println(reply);
		replyService.insertReply(reply);
		return "ok";
	}
}
