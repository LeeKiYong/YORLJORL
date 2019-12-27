package Model.DTO;

import java.io.Serializable;
import java.sql.Timestamp;

//직렬화 ??  >> DB와 DTO를 연결 시켜줘야 함  >>SerializableException 이 나올 시
@SuppressWarnings("serial")
public class ContestDTO implements Serializable {

	Long contestNum;
	String contestName;
	Timestamp contestStart;
	Timestamp contestEnd;
	String contestFirst;
	String contestSecond;
	String contestThird;
	
	public Long getContestNum() {
		return contestNum;
	}
	public void setContestNum(Long contestNum) {
		this.contestNum = contestNum;
	}
	public String getContestName() {
		return contestName;
	}
	public void setContestName(String contestName) {
		this.contestName = contestName;
	}
	public Timestamp getContestStart() {
		return contestStart;
	}
	public void setContestStart(Timestamp contestStart) {
		this.contestStart = contestStart;
	}
	public Timestamp getContestEnd() {
		return contestEnd;
	}
	public void setContestEnd(Timestamp contestEnd) {
		this.contestEnd = contestEnd;
	}
	public String getContestFirst() {
		return contestFirst;
	}
	public void setContestFirst(String contestFirst) {
		this.contestFirst = contestFirst;
	}
	public String getContestSecond() {
		return contestSecond;
	}
	public void setContestSecond(String contestSecond) {
		this.contestSecond = contestSecond;
	}
	public String getContestThird() {
		return contestThird;
	}
	public void setContestThird(String contestThird) {
		this.contestThird = contestThird;
	}
	
	
	
}
