package Service.Notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import Command.Notice.NoticeListCommand;
import Model.DTO.NoticeDTO;
import Repository.Notice.NoticeRepository;

@Service
public class NoticeListService {
	@Autowired
	private NoticeRepository noticeRepository;

	public void getNoticeList(Integer page, Model model, NoticeListCommand noticeListCommand) {
		int nowPage = 1;
		if(page != null) {
			nowPage = page;
		}
		//한 페이지의 리스트 수
		int limit = 15;
		//페이지 번호 출력 갯수
		int limitPage = 10;
		
		List<NoticeDTO> notice = noticeRepository.noticeListAll(nowPage, limit, noticeListCommand);
		int totalCount = noticeRepository.getNoticeCount();
		
		//최대페이지
		int maxPage = (int)((double)totalCount/limit + 0.95);
		//시작페이지
		int startPage = (int)(((double)nowPage/limitPage + 0.9)-1) *10 +1;
		//마지막페이지
		int endPage = startPage + limitPage -1;
		
		if(endPage > maxPage) endPage = maxPage;
		
		model.addAttribute("notice", notice);
		model.addAttribute("totalCount", totalCount);
		model.addAttribute("maxPage", maxPage);
		model.addAttribute("startPage", startPage);
		model.addAttribute("endPage", endPage);
		model.addAttribute("page", nowPage);
		
	}

}
