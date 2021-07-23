package kr.green.test.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.*;

import kr.green.test.pagination.Criteria;
import kr.green.test.pagination.PageMaker;
import kr.green.test.service.*;
import kr.green.test.vo.*;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class ReplyController {
	
	ReplyService replyService;
	MemberService memberService;
	
	@PostMapping("/reply/ins")
	public String replyInsertPost(@RequestBody ReplyVO rvo) {
		return replyService.insertReply(rvo) == 0 ? "FAIL" : "OK";
	}
	@GetMapping(value="/reply/list/{rp_bd_num}/{page}")
	public Map<String,Object> replyListGet(@PathVariable("rp_bd_num") int rp_bd_num,
			@PathVariable("page") int page){
		HashMap<String, Object> map = new HashMap<String,Object>();
		Criteria cri = new Criteria(page,4);
		int totalCount = replyService.getTotalCount(rp_bd_num);
		PageMaker pm = new PageMaker(totalCount, 3, cri);
		
		ArrayList<ReplyVO> list = replyService.getReplyList(rp_bd_num, cri);
		map.put("pm", pm);
		map.put("replyList", list);
		return map;
	}
}
