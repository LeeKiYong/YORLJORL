package Service.Notice;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import Model.DTO.NoticeDTO;
import Repository.Notice.NoticeRepository;

@Service
public class NoticeUpdateService {
	@Autowired
	NoticeRepository noticeRepository;

	public Integer noticeUpdate(String noticeClass, String noticeTitle, String noticeContent, MultipartFile[] noticeFn, HttpServletRequest request) {
		NoticeDTO notice = new NoticeDTO();
		
		notice.setNoticeTitle(noticeTitle);
		notice.setNoticeContent(noticeContent);
		notice.setNoticeClass(noticeClass);
		
		Integer result = noticeRepository.noticeUpdate(notice);
		return result;
		
	}

}
