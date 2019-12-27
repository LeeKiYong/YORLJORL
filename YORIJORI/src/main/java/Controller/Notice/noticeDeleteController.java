package Controller.Notice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Service.Notice.NoticeDeleteService;

@Controller
public class noticeDeleteController {
	@Autowired
	NoticeDeleteService noticeDeleteService;
	
	@RequestMapping("/notice/noticeDelete")
	public String noticeDelete(@RequestParam(value="noticeNum") int noticeNum) {
		noticeDeleteService.notDelete(noticeNum);
		return "redirect:/notice/noticeList";
	}
}
