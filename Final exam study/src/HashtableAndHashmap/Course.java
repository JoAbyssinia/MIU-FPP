package HashtableAndHashmap;

public class Course {
	
	String title;
	int cHour;
	public Course(String title, int cHour) {
		super();
		this.title = title;
		this.cHour = cHour;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getcHour() {
		return cHour;
	}
	public void setcHour(int cHour) {
		this.cHour = cHour;
	}
	
	@Override
	public String toString() {
		return "title: "+getTitle()+"creadit hour: "+getcHour();
	}
	
}
