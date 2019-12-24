package Controller.Notice;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import Command.Notice.noticeCommand;
import Service.Notice.NoticeUpdateService;

@Controller
public class noticeUpdateController {
	@Autowired
	NoticeUpdateService noticeUpdateService;
	
	@RequestMapping("/notice/noticeUpdate")
	public String noticeUpdate(@RequestParam(value="noticeNum") Integer noticeNum) {
		return "redirect:/notice/noticeUpdate";
	}
	
	@RequestMapping(value="/notice/noticeUpdatePro", method = RequestMethod.POST)
	public String noticeUp(noticeCommand noticeCommand, HttpServletRequest request) {
		noticeUpdateService.noticeUpdate(noticeCommand, request);
		return "notice/noticeDetail";
	}
	
	
}
