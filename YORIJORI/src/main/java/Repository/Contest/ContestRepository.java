package Repository.Contest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.DTO.ContestDTO;

@Repository
public class ContestRepository {
	
	//mybatis는 SqlSession 사용.
	//SqlSession 의존 객체 생성
	@Autowired
	private SqlSession sqlSession;
	
	//지정한 mapper namespace 찾기.
	private final String namespace = "ContestMapper";
	
	public Integer insertContest(ContestDTO dto) {
		String statement = namespace + ".contestInsert";
		return sqlSession.insert(statement, dto);
	}
	

}
