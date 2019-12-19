package Model.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import Model.DTO.NoticeDTO;

//DAO는 myBatis에서 쓰지 않으나 페이징 처리 때문에 일단 Spring에서 했던 방식으로 처리하고 남겨둠.
//해결하면 지울 것. 현재 공지사항 게시판 스프링/ 마이바티스 혼재...
public class NoticeDAO {
	private JdbcTemplate jdbcTemplate;
	private String sql;
	//notice 테이블 컬럼 집합 문자열
	private final String column = "notice_num, manaber_num, notice_title, notice_content, notice_class, notice_fn, notice_date";
	
	private RowMapper<NoticeDTO> noticeRowMapper = new RowMapper<NoticeDTO>() {
		public NoticeDTO mapRow(ResultSet rs, int rowNum) throws SQLException{
			NoticeDTO notice = new NoticeDTO();
			
			notice.setNoticeNum(rs.getInt("notice_num"));
			notice.setNoticeTitle(rs.getString("notice_title"));
			notice.setNoticeContent(rs.getString("notice_content"));
			notice.setNoticeClass(rs.getString("notice_class"));
			notice.setNoticeFn(rs.getString("notice_fn"));
			notice.setNoticeDate(rs.getTimestamp("notice_date"));
			
			return notice;
		}
	};
	
	@Autowired
	public NoticeDAO(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public List<NoticeDTO> noticeListAll(int nowPage, int limit) {
		sql = "selcet rn," + column + "from(select rownum rn," + column + "from( select" + column + "from notice"
			  + "order by notice_num)) where rn >= ? and rn <= ?";
		//잘 출력되는지 확인
		System.out.println(sql);
		
		int startrow = (nowPage -1) * limit +1;
		int endrow = startrow + limit -1;
		List<NoticeDTO> list = jdbcTemplate.query(sql, noticeRowMapper, startrow, endrow);
		
		return list;
	}

	public Integer getNoticeCount() {
		sql = "select count(*) from notice";
		return jdbcTemplate.queryForObject(sql, Integer.class);
	}

	public NoticeDTO noticeDetail(Long noticeNum) {
		sql = "select" + column + "from notice where notice_num =?";
		List<NoticeDTO> list = jdbcTemplate.query(sql, noticeRowMapper, noticeNum);
		return list.isEmpty()? null : list.get(0);
	}

}
