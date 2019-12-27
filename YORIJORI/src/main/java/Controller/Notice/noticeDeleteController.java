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
	
	@RequestMapping("/noticeDelete")
	public String noticeDelete(@RequestParam("num") Integer noticeNum) {
		noticeDeleteService.notDelete(noticeNum);
		return "redirect:/notice/noticeList";
	}
}
