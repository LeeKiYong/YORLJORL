package Model.DTO;

import java.io.Serializable;
import java.sql.Timestamp;

@SuppressWarnings("serial")
public class NoticeDTO implements Serializable {
	//Notice 테이블 컬럼 값 설정
	Integer noticeNum;
	Integer managerNum;
	String noticeTitle;
	String noticeContent;
	String noticeClass;
	String noticeFn;
	Timestamp noticeDate;
		 
	//게터 세터 생성
	public Integer getNoticeNum() {
		return noticeNum;
	}
	public void setNoticeNum(Integer noticeNum) {
		this.noticeNum = noticeNum;
	}
	public Integer getManagerNum() {
		return managerNum;
	}
	public void setManagerNum(Integer managerNum) {
		this.managerNum = managerNum;
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
	public String getNoticeClass() {
		return noticeClass;
	}
	public void setNoticeClass(String noticeClass) {
		this.noticeClass = noticeClass;
	}
	public String getNoticeFn() {
		return noticeFn;
	}
	public void setNoticeFn(String noticeFn) {
		this.noticeFn = noticeFn;
	}
	public Timestamp getNoticeDate() {
		return noticeDate;
	}
	public void setNoticeDate(Timestamp noticeDate) {
		this.noticeDate = noticeDate;
	}
	 
}
