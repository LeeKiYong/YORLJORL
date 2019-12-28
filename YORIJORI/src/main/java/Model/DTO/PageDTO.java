package Model.DTO;

import Command.Notice.NoticeListCommand;

//공지게시판 페이징을 위해 만든 DTO
public class PageDTO {
	Integer startRow;
	Integer endRow;
	NoticeListCommand noticeListCommand;
	
	public PageDTO(Integer startRow, Integer endRow, NoticeListCommand noticeListCommand) {
		super();
		this.startRow = startRow;
		this.endRow = endRow;
		this.noticeListCommand = noticeListCommand;
	}

	public Integer getStartRow() {
		return startRow;
	}

	public Integer getEndRow() {
		return endRow;
	}

	public NoticeListCommand getNoticeListCommand() {
		return noticeListCommand;
	}

}
