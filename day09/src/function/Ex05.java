package function;

public class Ex05 {
	// main에서 객체 없이 바로 호출하는 함수 앞에는 static을 붙여주면 된다
	
	static int getBigNumber(int num1, int num2) {	// 함수가 필요로하는 값 (매개변수, 소비=consumes)
		int big = num1>num2 ? num1:num2;
		return big;		// 함수가 내보내는 값 (반환값, 생산=produces)
	}
	// 함수의 입력과 출력 (stdin, stdout (x))
	// 함수의 생산과 소비 (produces, consumes)
	
	
	
	public static void main(String[] args) {
		// 두 정수 중에서 큰 수를 반환하는 함수 만들기
		int n1 = 3, n2 = 5;
		int n3 = getBigNumber(n1,n2);
		System.out.printf("%d, %d 중에서 큰 수는 %d입니다\n" , n1, n2, n3);
	}

}
