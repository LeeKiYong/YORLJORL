package Service.Contest;

import java.io.File;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import Command.Contest.ParticipationCommand;
import Model.DTO.AuthInfo;
import Model.DTO.ParticipationDTO;
import Repository.Participation.ParticipationRepository;

@Service
public class ParticipationInsertService {

	@Autowired
	ParticipationRepository participationRepository;
	
	String original = null;
	String originalFileExtension = null;
	String store = null;
	String fileSize = null;
	
	public void insert(ParticipationCommand participationCommand, HttpSession session, HttpServletRequest request) {
		
		//DTO
		ParticipationDTO dto = new ParticipationDTO();
		
		System.out.println(participationCommand.getContestNum());
		System.out.println(((AuthInfo)session.getAttribute("authInfo")).getId());
		System.out.println(((AuthInfo)session.getAttribute("authInfo")).getNum());
		System.out.println(participationCommand.getReport());
		
		
		//command 데이터 DTO에 저장
		//session 값 중 아이디값 가져오기 (authInfo)		
		dto.setMemId(((AuthInfo)session.getAttribute("authInfo")).getId());
		dto.setMemNum(((AuthInfo)session.getAttribute("authInfo")).getNum());
		dto.setContestNum(participationCommand.getContestNum());
		dto.setParticipationIntro(participationCommand.getParticipationIntro());
		
		System.out.println(dto.getMemId());
		System.out.println(dto.getMemNum());
		System.out.println(dto.getContestNum());
		System.out.println(dto.getParticipationIntro());
		
		//배열값을? DTO에 저장하기 위해. >> 여러개를 넣어야 함 (String 사용이 편함)
		//"" 준 이유  >> 문자열을 더하기 때문에 null을 줄순 없음(nullpointerror 나옴)
		// 싱글톤이기 때문에 메소드 안에 있어야 여러번 더 돌지 않는다.
		String originalTotal = "";
		String storeTotal = "";
		String fileSizeTotal = "";
		
		//ParticipationCommand의 report를 DTO에 저장(현재 Multipart 타입 >> String 타입으로 변환해서 저장)
		//여러개의 파일 업로드를 하기 위해서 report는 배열값을 저장
		//for문으로 배열의 값을 하나하나씩 가져옴.
		for(MultipartFile mf : participationCommand.getReport()) {
			
			//원본파일 이름
			original = mf.getOriginalFilename();
			//확장자명만 가져오기. (xxxx.확장자명 >> '.' 뒤에 있는 확장자명 가져오기)
			originalFileExtension = original.substring(original.lastIndexOf("."));
			//UUID로 저장 할 시 파일 이름 지정하기.  >> randomUUID 문자 랜덤 + originalFileExtension(확장자명)
			store = UUID.randomUUID().toString().replaceAll("-", "" + originalFileExtension);
			//파일 사이즈  >>> DTO에 지정한 String타입으로 변환.
			fileSize = Long.toString(mf.getSize());
			
			//Total값 (DTO 및 DB에 저장되는 여러개의 파일 정보들 ) >>> 구분하기 위해 '-'사용
			// ex) xxxx-xxxx-xxxx-xxxx.......
			originalTotal += original + "-";
			storeTotal += store + "-";
			fileSizeTotal += fileSize + "-";
			
			//저장 경로(path)가 있어야 파일들이 저장됨 >>> 저장경로 지정
			//해당 경로 뒤에 저장할 파일 이름 저장.
			String path = request.getServletContext().getRealPath("/");
			path += "WEB-INF/view/contest/upload/";
			System.out.println("파일 저장 경로  ::  " + path);
			File file = new File(path + store);
			try {
				mf.transferTo(file);
			} catch (Exception e) {
				//파일의 경로 or 저장될 파일이 없을 때.
				e.printStackTrace();
			}
		}
		
		System.out.println("원본파일 이름  ::  " + originalTotal);
		System.out.println("저장된 파일 이름  ::  " + storeTotal);
		System.out.println("파일크기  ::  " + fileSizeTotal);
		
		//파일정보 DTO에 넣기
		dto.setParticipationOriginal(originalTotal);
		dto.setParticipationStore(storeTotal);
		dto.setParticipationFileSize(fileSizeTotal);
		
		//Repository 사용
		participationRepository.participationInsert(dto);
	}

}
