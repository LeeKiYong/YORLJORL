package Repository.Notice;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Command.Notice.NoticeListCommand;
import Model.DTO.NoticeDTO;
import Model.DTO.PageDTO;

@Repository
public class NoticeRepository {
	@Autowired
	private SqlSession sqlSession;
	
	private final String namespace = "Repository.Notice.NoticeMapper";
	
	public Integer noticeInsert(NoticeDTO noticeDTO) {
		String statement = namespace + ".noticeInsert";
		Integer result = sqlSession.insert(statement, noticeDTO);
		return result;
		
	}

	public NoticeDTO noticeDetail(Long noticeNum) {
		String statement = namespace + ".noticeDetail";
		NoticeDTO noticeDTO = sqlSession.selectOne(statement, noticeNum);
		return noticeDTO;
	}

	public List<NoticeDTO> noticeListAll(int nowPage, int limit, NoticeListCommand noticeListCommand) {
		int startrow = (nowPage -1) * limit +1;
		int endrow = startrow + limit -1;
		PageDTO page = new PageDTO(startrow, endrow, noticeListCommand);
		String statement = namespace + ".noticeList";
		List<NoticeDTO> list = sqlSession.selectList(statement, page);
		return list;
	}

	//이게 맞을까? 페이징을 위한 카운트세는거. 일단 적어두고 물어보기.
	public int getNoticeCount() {
		String statement = namespace + ".noticeCount";
		int result = sqlSession.selectOne(statement);
		return result;
	}

}
