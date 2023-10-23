package loop;

public class Ex07 {
	public static void main(String[] args) {
		String s1 = "";
		
		for(int i=0; i<5; i++) {
			s1 += i;
		}
		
		for (char ch = 'A'; ch<='E'; ch ++) {
			s1 += ch;
		}
		
		System.out.println("s1 : " + s1);
		
		// 문자열에서 특정 글자만 새로운 문자열에 더하기
		String s2 = "";		// 모음을 저장할 String 변수
		String text1 ="Java is easy, Java is funny";
		
		for(int i=0; i<text1.length(); i++) {
			char ch = text1.charAt(i);
			
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				// 만약 text1에서 모음이 있다면 따로 s2에 저장
				s2 += ch;
			}
		}
		System.out.println("s2 : " + s2);
		System.out.println("s2.length() : " + s2.length());
		
		
		
		
	}

}
