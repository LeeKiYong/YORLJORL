package Repository.Manager;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;

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
		result = sqlSession.insert(statement,providerDTO);
		return result;
	}

	public List<ProviderDTO> providerSelect() {
		List<ProviderDTO> list = null;
		//Mapper에 있는 id 경로 
		String statement = namespace + ".providerSelect";//mapper에 있는 select를 찾아서 실행
		list = sqlSession.selectList(statement);
		return list;
	}

	public ProviderDTO providerSelectOne(ProviderDTO dto) {
		String statement = namespace + ".providerSelectOne";//mapper에 있는 selectOne을 찾아서 실행
		
		return sqlSession.selectOne(statement,dto);
	}

}
