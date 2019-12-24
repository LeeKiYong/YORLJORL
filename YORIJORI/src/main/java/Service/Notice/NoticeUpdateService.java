package Service.Notice;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Command.Notice.NoticeCommand;
import Model.DTO.NoticeDTO;
import Repository.Notice.NoticeRepository;

@Service
public class NoticeUpdateService {
	@Autowired
	NoticeRepository noticeRepository;

	public Integer noticeUpdate(NoticeCommand noticeCommand, HttpServletRequest request) {
		NoticeDTO notice = new NoticeDTO();
		
		notice.setNoticeTitle(noticeCommand.getNoticeTitle());
		notice.setNoticeContent(noticeCommand.getNoticeContent());
		notice.setNoticeClass(noticeCommand.getNoticeClass());
		
		Integer result = noticeRepository.noticeUpdate(notice);
		return result;
		
	}

}
