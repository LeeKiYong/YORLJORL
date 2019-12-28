package Service.Manager;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Command.manager.ManagerLoginCommand;
import Encrypt.Encrypt;
import Model.DTO.ManagerAutoInfo;
import Model.DTO.ManagerDTO;
import Repository.Manager.ManagerRepository;

@Service
public class ManagerLoginService {
	@Autowired
	ManagerRepository managerRepository;
	
	public Integer managerLoginPro(ManagerLoginCommand managerLoginCommand, HttpSession session, HttpServletResponse response) {
		Integer result = 0;
		
		ManagerDTO manDTO = new ManagerDTO();
		manDTO.setManagerId(managerLoginCommand.getMid());
		manDTO.setManagerPassword(managerLoginCommand.getMpw());
		System.out.println("커ㅁㅐㄴ드 " + managerLoginCommand.getMid());
		System.out.println("커맨드" + managerLoginCommand.getMpw());
		manDTO = managerRepository.managerCheck(manDTO);
		
		// 로그인세션
		ManagerAutoInfo managerAutoInfo = null;
		
		// 아이디랑 비밀번호가 디비에있는지 확인하는 조건문
		if(manDTO == null) {
			result = 0;
		} else {
			if(managerLoginCommand.getMpw().equals(manDTO.getManagerPassword())) {
				managerAutoInfo = new ManagerAutoInfo(manDTO.getManagerId(), manDTO.getManagerPassword(), manDTO.getManagerSecondPassword(), manDTO.getManagerName());
				// 세션에저장
				session.setAttribute("manauthInfo", managerAutoInfo);
				result = 1;
			}else {
				result = -1;
			}
		}
		return result;
	}
		
}
