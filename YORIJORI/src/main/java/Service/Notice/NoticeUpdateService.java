package Service.Notice;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import Command.Notice.NoticeCommand;
import Model.DTO.NoticeDTO;
import Repository.Notice.NoticeRepository;

@Service
public class NoticeUpdateService {
	@Autowired
	NoticeRepository noticeRepository;

	public Integer noticeUpdate(NoticeCommand noticeCommand, HttpServletRequest request) {
		NoticeDTO notice = new NoticeDTO();
		
		//값을 잘 받아오는지 테스트
		System.out.println(noticeCommand.getNoticeTitle());
		System.out.println(noticeCommand.getNoticeContent());
		System.out.println(noticeCommand.getNoticeClass());
		
		notice.setNoticeTitle(noticeCommand.getNoticeTitle());
		notice.setNoticeContent(noticeCommand.getNoticeContent());
		notice.setNoticeClass(noticeCommand.getNoticeClass());
		
		//업데이트 메소드 실행
		Integer result = noticeRepository.noticeUpdate(notice);
		return result;
		
	}

}
