package test;

public class StudentFunction {
	Student[] starr = new Student[100];
	
	void input(Student st) {
		for(int i=0; i<starr.length; i++) {
			if(starr[i] == null) {
				starr[i] = st;
				System.out.println("이름(반/번호) : "+starr[i].getName()+"("+starr[i].getBan()+"/"+starr[i].getNo()+")");
				System.out.println("국어 : "+starr[i].getKor()+"\n영어 : "+starr[i].getEng()+"\n수학 : "+starr[i].getMath());
				System.out.println("총점 : "+starr[i].getSum()+", 평균 : "+starr[i].getAvg());
				break;
			}
		}
	}
	
	void show() {
		System.out.println("==================");
		
		for(int i=0; i<starr.length; i++) {
			if(starr[i] != null) {
				System.out.println("이름(반/번호) : "+starr[i].getName()+"("+starr[i].getBan()+"/"+starr[i].getNo()+")");
				System.out.println("국어 : "+starr[i].getKor()+", 영어 : "+starr[i].getEng()+", 수학 : "+starr[i].getMath());
				System.out.println("총점 : "+starr[i].getSum()+", 평균 : "+starr[i].getAvg());
				System.out.println("==================");
			}
		}
	}
	
	void arrByScore() {	// 평균 오름차순
		for(int i=0; i<starr.length; i++) {
				for(int j=i+1; j<starr.length; j++) {
					if(starr[j] != null) {
						if(starr[i].getAvg()>starr[j].getAvg()) {
							Student tmp = starr[i];
							starr[i] = starr[j];
							starr[j] = tmp;
					}
				}
			}
		}
	}
	
	
}// end of class
