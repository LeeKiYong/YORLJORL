package Repository.Manager;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.DTO.ProviderDTO;

@Repository
public class ProviderRepository {
	
	//mybatis는 jdbcTemplate 사용 x >>> Sqlsession 사용함
	//sqlsession 의존 객체 생성
	@Autowired
	private SqlSession sqlSession;
	
	//MemberMapper.xml에 정해준 namespace사용  >>> 같아야함
		//xxxMapper.xml에 쿼리문 작성.
		private final String namespace = "ProviderMapper";

	public Integer providerInsert(ProviderDTO providerDTO) {
		Integer result = null;
		//Mapper에 있는 id 경로 
		String statement = namespace + ".providerInsert";//mapper에 있는 insert를 찾아서 실행
		//sqlsession 사용 (insert, update, delete)  >>> Mapper에 지정한 쿼리문 읽어옴.
		result = sqlSession.insert(statement,providerDTO);
		return result;
	}

}
