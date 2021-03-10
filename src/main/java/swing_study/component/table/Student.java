package swing_study.component.table;

public class Student {
	private int stdNo;
	private String stdName;
	private int kor;
	private int eng;
	private int math;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int stdNo, String stdName, int kor, int eng, int math) {
		super();
		this.stdNo = stdNo;
		this.stdName = stdName;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public int getStdNo() {
		return stdNo;
	}
	public void setStdNo(int stdNo) {
		this.stdNo = stdNo;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	public int getTotal() {	
		return kor + eng + math;
	}
	
	public float getAvg() {
		return (float) (getTotal() / 3D);
		
	}
	
	@Override
	public String toString() {
		return String.format("%s, %s, %s, %s, %s %d %f", stdNo, stdName, kor, eng, math, getTotal(), getAvg());
	}
	
	
	
}
