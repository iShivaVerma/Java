package question6;

public class ScoreException extends Exception{

	String message;
	public ScoreException(String message) {
		super();
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "ScoreException [message=" + message + "]";
	}
	
}
