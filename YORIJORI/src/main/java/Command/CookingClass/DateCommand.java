package Command.CookingClass;

import java.text.SimpleDateFormat;
import java.util.*;

public class DateCommand {
	//달력을 위한 정보값 
	
	String year = "";
	String month = "";
	String date = "";
	String value = "";
	String schedule = "";
	String scheduleDetail = "";
	
	//게터세터 :)
	
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getSchedule() {
		return schedule;
	}
	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}
	public String getScheduleDetail() {
		return scheduleDetail;
	}
	public void setScheduleDetail(String scheduleDetail) {
		this.scheduleDetail = scheduleDetail;
	}
	
	//날짜에 관련된 달력 정보를 가지는 메소드
	public Map<String, Integer> todayInfo(DateCommand dateCommand){
		Map<String, Integer> todayDate = new HashMap<String, Integer>();
		Calendar cal = Calendar.getInstance();
		cal.set(Integer.parseInt(dateCommand.getYear()), Integer.parseInt(dateCommand.getMonth()), 1);
		
		int startDay = cal.getMinimum(Calendar.DATE);
		int endDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		int start = cal.get(Calendar.DAY_OF_WEEK);
		
		Calendar todayCal = Calendar.getInstance();
		SimpleDateFormat ysdf = new SimpleDateFormat("yyyy");
		SimpleDateFormat msdf = new SimpleDateFormat("M");
		
		int todayYear = Integer.parseInt(ysdf.format(todayCal.getTime()));
		int todayMonth = Integer.parseInt(msdf.format(todayCal.getTime()));
		
		int searchYear = Integer.parseInt(dateCommand.getYear());
		int searchMonth = Integer.parseInt(dateCommand.getMonth()) +1 ;
		
		int today = -1;
		if(todayYear == searchYear && todayMonth  == searchMonth) {
			SimpleDateFormat dsdf = new SimpleDateFormat("dd");
			today = Integer.parseInt(dsdf.format(todayCal.getTime()));
		}
		searchMonth = searchMonth -1;
		
		Map<String, Integer> beforeAfterCalendar = beforeAfterCalendar(searchYear, searchMonth);
		System.out.println("searchMonth :" + searchMonth);
		
		todayDate.put("start", start);
		todayDate.put("startDay", startDay);
		todayDate.put("endDay", endDay);
		todayDate.put("today", today);
		todayDate.put("searchYear", searchYear);
		todayDate.put("searchMonth", searchMonth+1);
		todayDate.put("beforeYear", beforeAfterCalendar.get("beforeYear"));
		todayDate.put("beforeMonth", beforeAfterCalendar.get("beforeMonth"));
		todayDate.put("afterYear", beforeAfterCalendar.get("afterYear"));
		todayDate.put("afterMonth", beforeAfterCalendar.get("afterMonth"));
		
		return todayDate;
		
	}
	
	//이전달, 다음달 및 이전년 다음년 메소드
	private Map<String, Integer> beforeAfterCalendar(int searchYear, int searchMonth){
		Map<String, Integer> beforeAfterDate = new HashMap<String, Integer>();
		int beforeYear = searchYear;
		int beforeMonth = searchMonth -1;
		int afterYear = searchYear ;
		int afterMonth = searchMonth +1;
		
		//이전년도로 가는...부분
		if(beforeMonth<0) {
			beforeMonth = 11;
			beforeYear = searchYear -1;
		}
		
		if(afterMonth>11) {
			afterMonth=0;
			afterYear=searchYear+1;
		}
		
		beforeAfterDate.put("beforeYear", beforeYear);
		beforeAfterDate.put("beforeMonth", beforeMonth);
		beforeAfterDate.put("afterYear", afterYear);
		beforeAfterDate.put("afterMonth", afterMonth);
		
		return beforeAfterDate;
	}
	
	//생성자
	public DateCommand(String year, String month, String date, String value) {
		if ((month != null && month != "") && (date != null && date != "")) {
			this.year = year ;
			this.month = month;
		}
	}
	
	public DateCommand() {
		
	}
	
	@Override
	public String toString() {
		return "DateCommand [year=" + year + ", month=" + month + ", date=" + date + ",value=" + value + "]";
	}
}
