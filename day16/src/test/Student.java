package test;

public class Student {
	private String name;
	private int ban;
	private int no;
	private int kor, eng, math;
	private int sum;
	private double avg = Math.round(sum/3.0*10)/10;
	
	Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;		this.eng = eng;		this.math = math;
		sum = kor+eng+math;
		avg = Math.round(sum/3.0*10)/10;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBan() {
		return ban;
	}
	public void setBan(int ban) {
		this.ban = ban;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
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

	public int getSum() {
		return sum;
	}

	public double getAvg() {
		return avg;
	}
	
	
	
	

}
