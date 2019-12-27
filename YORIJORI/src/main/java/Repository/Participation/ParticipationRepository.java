package Repository.Participation;

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
}
