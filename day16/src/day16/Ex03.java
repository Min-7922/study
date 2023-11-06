package day16;

class Student {
	String name;
	int ban, no, kor, eng, math;
	
	public Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;		this.no = no;
		this.kor = kor;		this.eng = eng;		this.math = math;
		info();
	}
	
	public Student() { }	// 기본생성자
	
	
	void info() {
		
	}
	
	int getTotal() {
		int sum = kor+eng+math;
		return sum;
	}
	
	float getAverage() {
		float avg = (Math.round((kor+eng+math)/3.0*10)/10f);
		return avg;
	}
	
	
	
}

public class Ex03 {
	public static void main(String[] args) {

		Student s1 = new Student("홍길동", 1, 1, 100, 60, 76);
		
		Student s2 = new Student();
		
		s2.name = "홍길동";
		s2.ban = 1;
		s2.no = 1;
		s2.kor = 100;
		s2.eng = 60;
		s2.math = 76;
		
		System.out.println("이름 : " + s2.name);
		System.out.println("총점 : " + s2.getTotal());
		System.out.println("평균 : " + s2.getAverage());
	}

}
