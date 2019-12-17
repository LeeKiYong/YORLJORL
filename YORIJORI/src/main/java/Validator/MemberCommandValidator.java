package Validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import Command.Member.MemberCommand;

//MemberCommand 유효성 검사.
public class MemberCommandValidator implements Validator {

	//이메일 정규표현식(패턴)
	//Email 검사.
	// ()중괄호  >> 묶음
	// ^ >> hat(첫글자) / @ >> at (다음)  / $ (맨마지막문자)
	// \\w >> 워드로 나온다.
	//A-z(A~Z) / a-z(a~z) / 0-9(0~9) / 가-힣(가~힣) /_(언더바) / -(대시) / +(모든글자)
	private static final String emailRegExp = 
			"^[_A-Za-z0-9-]+(.[_A-Za-z0-9-]+)*@(?:\\w+\\.)+\\w+$";
	private Pattern emailPattern;
	
	//생년월일 정규표현식(패턴) 검사
	//{} >> 개수
	private static final String birthRegExp =
			"^\\d{4}-\\d{2}-\\d{2}$";
	private Pattern birthPattern;
	
	//연락처입력 정규표현식(패턴) 검사
	private static final String phRegExp = 
			"^01(?:0|1|[6-9])(\\d{3}|\\d{4})(\\d{4})$";
	private Pattern phPattern;
	
	//패턴 정하고 정규표현식 초기화 시켜주기 위해.  >> 생성자 생성
	//생성자 생성
	public MemberCommandValidator() {
		emailPattern = Pattern.compile(emailRegExp);
		birthPattern = Pattern.compile(birthRegExp);
		phPattern = Pattern.compile(phRegExp);
	}
	
	public boolean supports(Class<?> clazz) {
		//안해줘도 크게 문제가 되지 않는다.
		return false;
	}

	public void validate(Object target, Errors errors) {
		
		//target에서 정규표현식을 비교하기 위해. (command 사용 >> 형변환)
		MemberCommand memCmd = (MemberCommand)target;
		
		//command 이메일 불러와 조건문 생성
		//memCmd.getMemEmail().trim().isEmpty() >> trim 공백 확인 / isEmpty 값이 비어있는지
		if(memCmd.getMemEmail() == null || memCmd.getMemEmail().trim().isEmpty()) {
			errors.rejectValue("memEmail", "required");
		} else {
			//비어있지 않을 때 or null이 아닐 때 >>> 패턴을 비교해서 맞는지 확인.
			//Matcher >>> return false or true
			//pattern의 정규화 표현식과  command에 저장된 email의 표현식 비교
			Matcher matcher = emailPattern.matcher(memCmd.getMemEmail());
			if(!matcher.matches()) {
				//matcher.matches() >> true  / !matcher.matches() >> false
				//정규화식이 다를 때
				errors.rejectValue("memEmail", "bad");
			}
		}
		
		//command 생년월일 불러와 조건문 생성
		//memCmd.getMemBirth().trim().isEmpty() >> trim 공백 확인 / isEmpty 값이 비어있는지
		if(memCmd.getMemBirth() == null || memCmd.getMemBirth().trim().isEmpty()) {
			errors.rejectValue("memBirth", "required");
		} else {
			//비어있지 않을 때 or null이 아닐 때 >>> 패턴을 비교해서 맞는지 확인.
			//Matcher >>> return false or true
			//pattern의 정규화 표현식과  command에 저장된 birth의 표현식 비교
			Matcher matcher = birthPattern.matcher(memCmd.getMemBirth());
			if(!matcher.matches()) {
				//matcher.matches() >> true  / !matcher.matches() >> false
				//정규화식이 다를 때
				errors.rejectValue("memBirth", "bad1");
			}
		}
		
		//command 생년월일 불러와 조건문 생성
		//memCmd.getMemPh().trim().isEmpty() >> trim 공백 확인 / isEmpty 값이 비어있는지
		if(memCmd.getMemPh() == null || memCmd.getMemPh().trim().isEmpty()) {
			errors.rejectValue("memPh", "required");
		} else {
			//비어있지 않을 때 or null이 아닐 때 >>> 패턴을 비교해서 맞는지 확인.
			//Matcher >>> return false or true
			//pattern의 정규화 표현식과  command에 저장된 ph의 표현식 비교
			Matcher matcher = phPattern.matcher(memCmd.getMemPh());
			if(!matcher.matches()) {
				//matcher.matches() >> true  / !matcher.matches() >> false
				//정규화식이 다를 때
				errors.rejectValue("memPh", "bad2");
			}
		}
		
		//나머지 폼 입력창에서 필수항목 입력하지 않았을 때 에러메세지 출력.
		//ValidationUtils errors 대신 사용 >>>> errors 인자 값으로 사용 해야함.
		//== errors.rejectValue("필드명", "에러메세지 출력변수")
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "memName", "required");
		ValidationUtils.rejectIfEmpty(errors, "memPw", "required");
		ValidationUtils.rejectIfEmpty(errors, "memId", "required");
		ValidationUtils.rejectIfEmpty(errors, "memAddr", "required");
		ValidationUtils.rejectIfEmpty(errors, "memPwCon", "required");
		
		//비밀번호 창에 입력값이 isEmpty가 아닐 시.
		if(!memCmd.getMemPw().isEmpty()) {
			//비밀번호와 비밀번호 확인 일치하는지 비교 후 유효성 검사(에러메세지 호출)
			if(!memCmd.isPasswordEqualToConfirmPassword()) {
				//!memCmd.isPasswordEqualToConfirmPassword() >>> false
				errors.rejectValue("memPwCon", "nomatch");
			}
		}
		
	}

}
