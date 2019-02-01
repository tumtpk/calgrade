
public class Process {
	int score;

	public Process(int score) {
		this.score = score;
	}
	
	public String calculate() {
		String grade;
		if(score >= 80) {
			grade = "A";
		}else if(score >= 75) {
			grade = "B+";
		}
		else {
			grade = "F";
		}
		return grade;
	}
}
