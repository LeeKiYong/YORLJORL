package Repository.Member;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.DTO.MemberDTO;

@Repository
public class MemberRepository {

	//mybatis는 jdbcTemplate 사용 x >>> Sqlsession 사용함
	//sqlsession 의존 객체 생성
	@Autowired
	private SqlSession sqlSession;
	
	//MemberMapper.xml에 정해준 namespace사용  >>> 같아야함
	//xxxMapper.xml에 쿼리문 작성.
	private final String namespace = "MemberMapper";
	
	//회원가입
	public Integer insertMember(MemberDTO dto) {
		Integer result = null;
		//Mapper에 있는 id 경로 
		String statement = namespace + ".memberInsert";
		//sqlsession 사용 (insert, update, delete)  >>> Mapper에 지정한 쿼리문 읽어옴.
		//insert/update/delete("맵퍼.xml안에 있는 sql문 아이디", 맵퍼.xml안에 있는 sql문에 해당하는 parameterType)
		result = sqlSession.insert(statement, dto);
		return result;
	}
	
	//로그인시 아이디 비교확인
	//입력된 id를 조건으로 주어 해당 id에 모든 데이터를 불러와 DTO 저장
	public MemberDTO userCheck(MemberDTO dto) {
		String statement = namespace + ".memCheck";
		return sqlSession.selectOne(statement, dto);
	}
}
