package Repository.Manager;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.DTO.ManagerDTO;

@Repository
public class ManagerRepository {
	@Autowired
	private SqlSession sqlSession;
	
	private final String namespace = "ManagerMapper";
	
	public ManagerDTO managerCheck(ManagerDTO manDTO) {
		System.out.println(manDTO.getManagerId());
		System.out.println(manDTO.getManagerPassword());
		String statement = namespace + ".manCheck";
		return sqlSession.selectOne(statement, manDTO);
	}
	
}
