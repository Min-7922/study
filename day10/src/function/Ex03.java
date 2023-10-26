package function;

public class Ex03 {
	static int getMaxNum(int n1, int n2) {
//		int max = n1;
//		if(n2>max) max=n2;
//		return max;
		
		return n1>n2 ? n1:n2;
	}
	
	// 세 정수 중에서 가장 큰 수 반환하기
	static int getMaxNum(int n1, int n2, int n3) {
		int max = n1;
		if(n2>max) max = n2;
		if(n3>max) max = n3;
		return max;
	}
	
	// n개의 정수중에서 가장 큰 값을 반환하기
	static int getMaxNum(int... arr) {	// 같은 자료형의 여러 매개변수 개수가 일정하지 않을 때
										// 가변인자 : 인자의 개수가 일정하지 않다
										// 알아서 배열형태로 바뀐다
		int result = 0;
//		for(int i=0; i<arr.length; i++) {	// 매개변수들을 순서대로 조회하면서
//			int num = arr[i];				// 각 숫자를 num이라고 했을 때
//			if(result<num) 					// 기존 최대값보다 더 큰 값이 있으면
//				result = num;				// 그 값을 최대값에 담는다
//		}
		
		for(int num : arr) {	// 위 코드를 간단하게 쓴 것 (같은 코드!)
			if(result<num) {
				result = num;
			}
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		// 두 정수 중에서 가장 큰 수 반환하기
		int num1 = getMaxNum(10, 20);
		int num2 = getMaxNum(10, 20, 30);
		int num3 = getMaxNum(1, 2, 3, 4, 5, 60, 700, -8, 99);
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println("num3 : " + num3);
		
	}

}
