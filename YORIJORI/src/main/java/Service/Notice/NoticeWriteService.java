package Service.Notice;

import java.io.File;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import Command.Notice.noticeCommand;
import Model.DAO.NoticeDAO;
import Model.DTO.NoticeDTO;

@Service
public class NoticeWriteService {
	@Autowired
	NoticeDAO noticeDAO;
	
	String origin = null;
	String originFe = null;
	String store = null;

	public void noticeWrite(noticeCommand noticeCommand, HttpServletRequest request) {
		NoticeDTO notice = new NoticeDTO();
		
		notice.setNoticeTitle(noticeCommand.getNoticeTitle());
		notice.setNoticeContent(noticeCommand.getNoticeContent());
		notice.setNoticeClass(noticeCommand.getNoticeClass());
		
		String original = "";
		
		for(MultipartFile mf : noticeCommand.getNoticeFn()) {
			//파일 이름을 가져옴
			origin = mf.getOriginalFilename();
			//확장자를 가져옴
			originFe = origin.substring(origin.lastIndexOf("."));
			store =  UUID.randomUUID().toString().replaceAll("-","")+ originFe;
			
			original += origin + "-";
			store += store + "-";
			
			//이아래가 꼭 필요한가? 일단 path는 필요할 것 같아서 설정.
			String path = request.getServletContext().getRealPath("/");
			path += "WEB-INF/view/notice/upload/";
			
			File file = new File(path + store);
			try {
				mf.transferTo(file);
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		notice.setNoticeFn(original);
		
		noticeDAO.noticeInsert(notice);
	}

}
