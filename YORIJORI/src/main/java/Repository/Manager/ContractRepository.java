package Repository.Manager;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.DTO.ContractDTO;

@Repository
public class ContractRepository {
	
	//mybatis는 jdbcTemplate 사용 x >>> Sqlsession 사용함
	//sqlsession 의존 객체 생성
	@Autowired
	private SqlSession sqlSession;
	
	//MemberMapper.xml에 정해준 namespace사용  >>> 같아야함
	//xxxMapper.xml에 쿼리문 작성.
	private final String namespace = "ContractMapper";

	public Integer insertContract(ContractDTO dto) {
		//Mapper에 있는 id 경로 
		String statement = namespace + ".ContractInsert";//mapper에 있는 insert를 찾아서 실행
		return sqlSession.insert(statement,dto);
	}

}
