package Service.Notice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import Model.DAO.NoticeDAO;
import Model.DTO.NoticeDTO;
import Repository.Notice.NoticeRepository;

@Service
public class NoticeDetailService {
	@Autowired
	NoticeRepository noticeRepository;

	public void noticeDetail(Model model, Long noticeNum) {
		NoticeDTO noticeDTO = noticeRepository.noticeDetail(noticeNum);
		/*
		 * 이부분 놔둘지 말지
		 * noticeDTO.setNoticeContent(noticeDTO.getNoticeContent().replace("\n", "<br />"));
			if(noticeDTO.getNoticeFn() != null) {
			String[] filename = noticeDTO.getNoticeFn().split("-");
			model.addAttribute("filename", filename);
			}
		 */
		
		model.addAttribute("notice", noticeDTO);
		
	}

}
