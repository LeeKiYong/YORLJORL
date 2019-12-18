package Command.Notice;

import org.springframework.web.multipart.MultipartFile;

public class noticeCommand {
	//noticeWrite 에서 입력한 값을 설정
	private String noticeClass;
	private String noticeTitle;
	private String noticeContent;
	private MultipartFile [] noticeFn;
	
	//게터세터 만듬
	public String getNoticeClass() {
		return noticeClass;
	}
	public void setNoticeClass(String noticeClass) {
		this.noticeClass = noticeClass;
	}
	public String getNoticeTitle() {
		return noticeTitle;
	}
	public void setNoticeTitle(String noticeTitle) {
		this.noticeTitle = noticeTitle;
	}
	public String getNoticeContent() {
		return noticeContent;
	}
	public void setNoticeContent(String noticeContent) {
		this.noticeContent = noticeContent;
	}
	public MultipartFile[] getNoticeFn() {
		return noticeFn;
	}
	public void setNoticeFn(MultipartFile[] noticeFn) {
		this.noticeFn = noticeFn;
	}
	
}
