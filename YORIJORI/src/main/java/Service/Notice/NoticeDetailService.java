package Service.Notice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import Model.DAO.NoticeDAO;
import Model.DTO.NoticeDTO;

@Service
public class NoticeDetailService {
	@Autowired
	NoticeDAO noticeDAO;

	public void noticeDetail(Model model, Long noticeNum) {
		NoticeDTO noticeDTO = noticeDAO.noticeDetail(noticeNum);
		//html 환경에서 띄어쓰기를 먹이기 위한 변환
		noticeDTO.setNoticeContent(noticeDTO.getNoticeContent().replace("\n", "<br />"));
		if(noticeDTO.getNoticeFn() != null) {
			String[] filename = noticeDTO.getNoticeFn().split("-");
			model.addAttribute("filename", filename);
		}
		
		model.addAttribute("notice", noticeDTO);
		
	}

}
