
public class Process {
	int score;

	public Process(int score) {
		this.score = score;
	}
	
	public char calculate() {
		char grade;
		if(score >= 80) {
			grade = 'A';
		}else {
			grade = 'F';
		}
		return grade;
	}
}
