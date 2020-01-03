package Service.Notice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Repository.Notice.NoticeRepository;

@Service
public class NoticeDeleteService {
	@Autowired
	NoticeRepository noticeRepository;

	public Integer notDelete(Integer noticeNum) {
		return noticeRepository.noticeDelete(noticeNum);
		
	}

}
