package Service.Notice;

import java.io.File;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import Command.Notice.NoticeCommand;
import Model.DTO.NoticeDTO;
import Repository.Notice.NoticeRepository;

@Service
public class NoticeWriteService {
	@Autowired
	NoticeRepository noticeRepository;
	
	String origin = null;
	String originFe = null;
	String store = null;

	public Integer noticeWrite(NoticeCommand noticeCommand, HttpServletRequest request) {
		NoticeDTO notice = new NoticeDTO();
		
		notice.setNoticeTitle(noticeCommand.getNoticeTitle());
		notice.setNoticeContent(noticeCommand.getNoticeContent());
		notice.setNoticeClass(noticeCommand.getNoticeClass());
		
		String original = "";
		
		System.out.println(noticeCommand.getNoticeTitle());
		System.out.println(noticeCommand.getNoticeContent());
		System.out.println(noticeCommand.getNoticeClass());
		System.out.println(noticeCommand.getNoticeFn());
		
		//파일을 여러 개 넣었을 때 이름값을 저장하기 위한 부분
		for(MultipartFile mf : noticeCommand.getNoticeFn()) {
			//파일 이름을 가져옴
			origin = mf.getOriginalFilename();
			//확장자를 가져옴
			originFe = origin.substring(origin.lastIndexOf("."));
			store =  UUID.randomUUID().toString().replaceAll("-","")+ originFe;
			
			original += origin + "-";
			store += store + "-";
			
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
		
		Integer result = noticeRepository.noticeInsert(notice);
		return result;
	}

}
