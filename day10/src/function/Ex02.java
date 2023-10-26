package function;

public class Ex02 {
	static int add(int n1, int n2) {
		int answer = n1 + n2;
		return answer;
	}
	
	static int getMinNumber(int n1, int n2, int n3) {
		int min = n1;
		if(n2<min) min = n2;
		if(n3<min) min = n3;
		
		return min;
	}
	
	static String upperCase(String str) {
		// A : 65	// a : 97
		String upper = "";
		char[] arr = new char[str.length()];
		
		for(int i=0; i<str.length(); i++) {
//			arr[i]=str.charAt(i);
//			if('a'<=arr[0] && arr[0]<='z') {
//				arr[0] -= 32;
//			}
//			upper += arr[i];
			
			char ch = str.charAt(i);
			if(i==0 && 'a'<=ch && ch<='z') {
				ch -= 32;
			}
			upper += ch;
		}
		return upper;
	}
	
	static String substring(String str, int from, int to) {
		String sub = "";
		
		char[] arr = new char[str.length()];
		
		for(int i=0; i<str.length(); i++) {
			arr[i] = str.charAt(i);
			
			if(i>=from) {
				if(i==(to)) break;
				sub += arr[i];
			}
		}
		return sub;
	}
	
	
	public static void main(String[] args) {
		// 1) 두 정수의 덧셈을 반환하는 함수 add를 작성하세요
		int result1 = add(10, 20);
		System.out.println("q1 : "+result1);
		
		// 2) 세 정수를 전달받아서 가장 작은 수를 반환하는 함수 getMinNumber를 작성하세요
		int result2 = getMinNumber(60, 20, 5);
		System.out.println("q2 : " + result2);
		
		// 3) 문자열 하나를 전달받아서, 첫글자를 대문자로 변환하는 함수 upperCase를 작성하세요
		String result3 = upperCase("hello");
		System.out.println("q3 : " +result3); 	// Hello
		String t3 = upperCase("3 year later");
		System.out.println("t3 : " + t3); 			// 3 year later
		
		// 4) 문자열 하나와 정수 2개를 전달받아서
		// 문자열의 from번째 글자부터 to글자 이전까지의 글자를 잘라낸
		// 새로운 문자열을 반환하는 함수 substring을 작성하세요
		String q4 = substring("Hello, world !!",0,5);
		System.out.println("q4 : " + q4); 	// Hello
		
		String t4 = substring("Hello, world !!",7,12);
		System.out.println("t4 : " + t4); 	// world
	}

}














