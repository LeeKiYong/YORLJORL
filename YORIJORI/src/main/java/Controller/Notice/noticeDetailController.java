package Controller.Notice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Service.Notice.NoticeDetailService;

@Controller
public class noticeDetailController {
	@Autowired
	NoticeDetailService noticeDetailService;
	
	@RequestMapping("/board/answerBoardDetail")
	public String boardView(@RequestParam(value="num") Long noticeNum, Model model) {
		noticeDetailService.noticeDetail(model, noticeNum);
		
		return "notice/noticeDetail";
	}
	
}
