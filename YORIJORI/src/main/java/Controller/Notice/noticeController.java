package Controller.Notice;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import Command.Notice.NoticeCommand;
import Command.Notice.NoticeListCommand;
import Service.Notice.NoticeListService;
import Service.Notice.NoticeWriteService;

@Controller
public class noticeController {
	@Autowired
	NoticeWriteService noticeWriteService;
	@Autowired
	NoticeListService noticeListService;
	
	//리스트에서 공지글 쓰기 버튼을 눌렀을 때
	@RequestMapping("/noticeWrite")
	public String noticeWrite(NoticeCommand noticeCommand) {
		return "notice/noticeWrite";
	}
	
	//공지글쓰기 페이지에서 등록 버튼을 눌렀을 때
	@RequestMapping(value="/noticeWritePro", method = RequestMethod.POST)
	public String write(NoticeCommand noticeCommand, HttpServletRequest request) {
		noticeWriteService.noticeWrite(noticeCommand, request );
		return "notice/noticeList";
		
	}
	
	//어느 경우든 공지사항 리스트로 이동
	@RequestMapping("/noticeList")
	public String noticeList(@RequestParam(value="page", required = false) Integer page, Model model, NoticeListCommand noticeListCommand) {
		noticeListService.getNoticeList(page, model, noticeListCommand);
		return "notice/noticeList";
	}

}
