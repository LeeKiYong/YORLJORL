package Repository.Participation;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.DTO.ParticipationDTO;

@Repository
public class ParticipationRepository {

	//SqlSession 선언.
	@Autowired
	private SqlSession sqlSession;
	
	//불러올 mapper 지정.
	private final String namespace = "ParticipationMapper";
	
	//참가자 등록.
	public void participationInsert(ParticipationDTO dto) {
		String statement = namespace + ".participationInsert";
		sqlSession.insert(statement, dto);
	}
	
	//참가자 리스트 전체 select
	public List<ParticipationDTO> selectAll() {
		String statement = namespace + ".participationSelect";
		return sqlSession.selectList(statement);
	}
	
	//수정된 참가자 리스트 (app='Y') select
	public List<ParticipationDTO> selectUpdateAll() {
		String statement = namespace + ".upParticipationSelect";
		return sqlSession.selectList(statement);
	}

	//참가자 승인
	public Integer appUpdate(Map<String, Object> parNum) {
		String statement = namespace + ".upParticipationApp";
		return sqlSession.update(statement, parNum);
	}
	
	
}
