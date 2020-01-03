package Controller.Notice;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import Command.Notice.NoticeCommand;
import Service.Notice.NoticeUpdateService;

@Controller
public class noticeUpdateController {
	@Autowired
	NoticeUpdateService noticeUpdateService;
	
	@RequestMapping(value="/noticeUpdate", method = RequestMethod.GET)
	public String noticeUpdate(@RequestParam("num") Integer noticeNum) {
		//num값을 아예 못받아오는지 확인
		System.out.println(noticeNum);
		
		return "redirect:/noticeUpdate";
	}
	
	@RequestMapping(value="/noticeUpdatePro", method = RequestMethod.POST)
	public String noticeUp(NoticeCommand noticeCommand, HttpServletRequest request) {
		noticeUpdateService.noticeUpdate(noticeCommand, request);
		return "notice/noticeDetail";
	}
	
	
}
