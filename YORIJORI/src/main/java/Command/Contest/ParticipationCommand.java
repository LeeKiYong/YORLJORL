package Command.Contest;

import org.springframework.web.multipart.MultipartFile;

public class ParticipationCommand {
	
	private Long contestNum;
	private String participationIntro;
	MultipartFile[] report;
	
	public Long getContestNum() {
		return contestNum;
	}
	public void setContestNum(Long contestNum) {
		this.contestNum = contestNum;
	}
	public String getParticipationIntro() {
		return participationIntro;
	}
	public void setParticipationIntro(String participationIntro) {
		this.participationIntro = participationIntro;
	}
	public MultipartFile[] getReport() {
		return report;
	}
	public void setReport(MultipartFile[] report) {
		this.report = report;
	}
	
}
