package Controller.CookingClass;

import java.util.*;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Command.CookingClass.CookingCommand;
import Command.CookingClass.DateCommand;
import Service.CookingClass.CookingMyclassService;

@Controller
public class MyClassController {
	@Autowired
	CookingMyclassService cookingMyclassService;
	
	//수업 등록페이지로 이동
	@RequestMapping("/MyClassReg")
	public String ClassReg() {
		return "member/ClassWrite";
	}
	
	//수업 등록페이지에서 등록 누르면.
	@RequestMapping(value="/ClassWritePro", method=RequestMethod.POST)
	public String ClassWrite(CookingCommand cookingCommand, HttpServletRequest request) {
		cookingMyclassService.classWrite(cookingCommand, request);
		return "";
	}
	
	//나의 수업 페이지롤 이동
	@RequestMapping("/memberMyClass")
	public String myClassHome(Model model, HttpServletRequest request, DateCommand dateCommand) {
		Calendar cal = Calendar.getInstance();
		DateCommand calendarDate;
		
		Map<String, Integer> todayInfo = dateCommand.todayInfo(dateCommand);
		List<DateCommand> dateList = new ArrayList<DateCommand>();
		
		//시작일까지 아무것도 없는 데이터 넣음
		for(int i=1; i<todayInfo.get("start"); i++) {
			calendarDate = new DateCommand(null, null, null, null);
			dateList.add(calendarDate);
		}
		
		//날짜
		for (int i = todayInfo.get("startDay"); i <= todayInfo.get("endDay"); i++) {
			calendarDate = new DateCommand(String.valueOf(dateCommand.getYear()), String.valueOf(dateCommand.getMonth()), String.valueOf(i), String.valueOf(dateCommand.getValue()));
			dateList.add(calendarDate);
		}
		
		int index = 7-dateList.size() %7;
		
		//남는 날 빈 데이터로 넣음
		if(dateList.size() %7 !=0) {
			for (int i = 0; i< index; i++) {
				calendarDate = new DateCommand(null, null, null, null);
				dateList.add(calendarDate);
			}
		}
		
		System.out.println(dateList);
		
		//배열
		model.addAttribute("dateList", dateList);
		model.addAttribute("todayInfo", todayInfo);
		
		return "member/memberMyClass";
	}
}
