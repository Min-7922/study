package function;

import java.util.Scanner;

public class Quiz1 {
	// 1)
	static String getSign(int num) {
		String number = num + "";
		return number;
	}
	
	// 2)
	static int getReverseNum(int num) {
		int rev = 0;
		
		while(num != 0 ) {	
			rev *= 10;				
			rev += num % 10;		
			num /= 10;				
		}
		
		
//		String str = num + "";
//		String reverse="";
//		int n = str.length();
//		
//		for(int i=0; i<n; i++) {
//			reverse += str.substring(str.length()-1);
//			str = str.substring(0,str.length()-1);
//		}
//		rev = Integer.parseInt(reverse);
		
		return rev;
	}
	
	
	// 3)
	static int pow(int n1, int n2) {
		int num = 1;					
		for(int i=0; i<n2; i++) {		
			num *= n1;					
		}
		return num;
	}
	
	
	// 4) 
	static int remainder(int n1, int n2) {
		int num = n1%n2;
		return num;
	}
	
	
	// 5)
	static String getReverseStr(String str) {
		String rev=str;
		
		String reverse="";
		int n = str.length();
		
//		for(int i=0; i<n; i++) {
//			reverse += str.substring(str.length()-1);
//			str = str.substring(0,str.length()-1);
//		}
		
		char[] arr = new char[n];
		for(int i=0; i<n; i++) {
			arr[i]=str.charAt(i);
		}	
			
		for(int j=n-1;j>=0;j--) {
			reverse += arr[j];
		}
		
		
		rev = reverse;
		return rev;
	}
	

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 1) 정수를 하나 전달받아서, 양수, 음수, 0을 문자열로 반환하는 함수 getSign
		String ans1 = getSign(0);
		System.out.println("1번문제 : "+ans1);
		
		
		// 2) 정수를 하나 전달받아서 정수의 배치를 거꾸로 뒤집어 반환하는 함수 getReverseNum
		int ans2 = getReverseNum(123456);
		System.out.println("2번문제 : "+ans2);
		
		
		// 3) 두 정수를 전달받아서 n1의 n2제곱수를 반환하는 함수 pow
		int ans3 = pow(2,3);
		System.out.println("3번문제 : "+ans3);
		
		
		// 4) 두 정수를 전달받아서 n1을 n2로 나누었을때의 나머지를 반환하는 함수 remainder
		int ans4 = remainder(100, 6);
		System.out.println("4번문제 : "+ans4);
		
		
		// 5) 문자열을 하나 전달받아서, 문자열을 거꾸로 배치한 값을 반환하는 함수 getReverseStr
		String ans5 = getReverseStr("Hello");
		System.out.println("5번문제 : "+ans5);
	}


}
