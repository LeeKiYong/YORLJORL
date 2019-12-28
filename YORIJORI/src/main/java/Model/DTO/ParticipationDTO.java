package Model.DTO;

import java.io.Serializable;

//직렬화 ??  >> DB와 DTO를 연결 시켜줘야 함  >>SerializableException 이 나올 시
@SuppressWarnings("serial")
public class ParticipationDTO implements Serializable {

	Long participationNum;
	Long contestNum;
	Long memNum;
	String memId;
	String participationIntro;
	String participationApp;
	Integer participationScore;
	Integer participationRank;
	String participationOriginal;
	String participationStore;
	String participationFileSize;
	
	public Long getParticipationNum() {
		return participationNum;
	}
	public void setParticipationNum(Long participationNum) {
		this.participationNum = participationNum;
	}
	public Long getContestNum() {
		return contestNum;
	}
	public void setContestNum(Long contestNum) {
		this.contestNum = contestNum;
	}
	public Long getMemNum() {
		return memNum;
	}
	public void setMemNum(Long memNum) {
		this.memNum = memNum;
	}
	public String getMemId() {
		return memId;
	}
	public void setMemId(String memId) {
		this.memId = memId;
	}
	public String getParticipationIntro() {
		return participationIntro;
	}
	public void setParticipationIntro(String participationIntro) {
		this.participationIntro = participationIntro;
	}
	public String getParticipationApp() {
		return participationApp;
	}
	public void setParticipationApp(String participationApp) {
		this.participationApp = participationApp;
	}
	public Integer getParticipationScore() {
		return participationScore;
	}
	public void setParticipationScore(Integer participationScore) {
		this.participationScore = participationScore;
	}
	public Integer getParticipationRank() {
		return participationRank;
	}
	public void setParticipationRank(Integer participationRank) {
		this.participationRank = participationRank;
	}
	public String getParticipationOriginal() {
		return participationOriginal;
	}
	public void setParticipationOriginal(String participationOriginal) {
		this.participationOriginal = participationOriginal;
	}
	public String getParticipationStore() {
		return participationStore;
	}
	public void setParticipationStore(String participationStore) {
		this.participationStore = participationStore;
	}
	public String getParticipationFileSize() {
		return participationFileSize;
	}
	public void setParticipationFileSize(String participationFileSize) {
		this.participationFileSize = participationFileSize;
	}
	
}
