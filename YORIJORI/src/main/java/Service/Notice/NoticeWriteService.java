package Service.Notice;

//import java.io.File;
//import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.web.multipart.MultipartFile;

import Command.Notice.NoticeCommand;
import Model.DTO.NoticeDTO;
import Repository.Notice.NoticeRepository;

@Service
public class NoticeWriteService {
	@Autowired
	NoticeRepository noticeRepository;
	
	/* 파일 업로드를 현재 제외하였으므로 주석처리합니다.
	String origin = null;
	String originFe = null;
	String store = null;
	*/
	
	public Integer noticeWrite(NoticeCommand noticeCommand, HttpServletRequest request) {
		NoticeDTO notice = new NoticeDTO();
		
		notice.setNoticeTitle(noticeCommand.getNoticeTitle());
		notice.setNoticeContent(noticeCommand.getNoticeContent());
		notice.setNoticeClass(noticeCommand.getNoticeClass());
		
		//String original = "";  파일 업로드를 현재 제외하였으므로 주석처리합니다.
		
		//값을 받아오는지 콘솔 테스트
		System.out.println(noticeCommand.getNoticeTitle());
		System.out.println(noticeCommand.getNoticeContent());
		System.out.println(noticeCommand.getNoticeClass());
		
		System.out.println("dto  ::  " + notice.getNoticeTitle());
		System.out.println("dto  ::  " + notice.getNoticeContent());
		System.out.println("dto  ::  " + notice.getNoticeClass());
		
		//파일을 여러 개 넣었을 때 이름값을 저장하기 위한 부분이었지만 파일 업로드를 현재 제외하였으므로 주석처리합니다.
		/*
		for(MultipartFile mf : noticeFn ) {
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
		*/
		
		//작업한 값을 받아서 레포지토리 메소드에서 처리.
		Integer result = noticeRepository.noticeInsert(notice);
		return result;
	}

}
