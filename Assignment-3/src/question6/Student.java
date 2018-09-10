package question6;

public class Student {

	private int studentId;
	private int scores;
	
	public Student(int studentId, int scores) {
		super();
		this.studentId = studentId;
		this.scores = scores;
	}
	
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getScores() {
		return scores;
	}

	public void setScores(int scores) {
		this.scores = scores;
	}

	public void insertScores(int scores) throws ScoreException{
		if(scores<0 || scores>100){
			throw new ScoreException("Not A Valid Number");
		}
		else
			setScores(scores);
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", scores=" + scores + "]";
	}
	
}
