package Repository.Chef;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import Model.DTO.ChefSignUpDTO;

public class ChefSignUpRepository {
	@Autowired
	private SqlSession sqlSession;
	
	private final String namespace = "ChefMapper";
	
	public Integer chefSignUp(ChefSignUpDTO chefSignUpDTO) {
		String statement = namespace + ".chefSignUpInsert";
		Integer result = sqlSession.insert(statement, chefSignUpDTO);
		return result;
	}
}
