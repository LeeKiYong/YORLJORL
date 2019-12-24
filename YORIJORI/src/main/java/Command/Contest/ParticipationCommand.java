package Command.Contest;

import org.springframework.web.multipart.MultipartFile;

public class ParticipationCommand {
	
	private String participationIntro;
	MultipartFile[] report;
	
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
