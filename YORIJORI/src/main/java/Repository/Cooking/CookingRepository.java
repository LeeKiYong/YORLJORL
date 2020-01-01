package Repository.Cooking;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.DTO.ClassplanDTO;

@Repository
public class CookingRepository {
	@Autowired
	private SqlSession sqlSession;
	
	private final String namespace = "CookingMapper";

	//수업 등록 메소드
	public Integer planInsert(ClassplanDTO plan) {
		String statement = namespace + ".planInsert";
		Integer result = sqlSession.insert(statement, plan);
		return result;
	}

	public ClassplanDTO classDetail(Integer classNum) {
		String statement = namespace + ".planDetail";
		ClassplanDTO plan = sqlSession.selectOne(statement, classNum);
		return plan;
	}

}
