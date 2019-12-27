package Service.Notice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import Model.DTO.NoticeDTO;
import Repository.Notice.NoticeRepository;

@Service
public class NoticeDetailService {
	@Autowired
	NoticeRepository noticeRepository;

	public void noticeDetail(Model model, Integer noticeNum) {
		NoticeDTO noticeDTO = noticeRepository.noticeDetail(noticeNum);
		//띄어쓰기가 적용되도록 하는 부분
		noticeDTO.setNoticeContent(noticeDTO.getNoticeContent().replace("\n", "<br />"));
		
		model.addAttribute("notice", noticeDTO);
		
	}

}
