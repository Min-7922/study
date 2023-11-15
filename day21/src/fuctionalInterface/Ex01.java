package fuctionalInterface;

interface Test {			// 함수형 인터페이스
	void method(String s);	// 인터페이스 중에서 추상메서드가 오직 하나만 있는 형식
}

class Repository {
	String[] arr = new String[5];	// 배열 5칸을 가지고 있는 Repository
	
	public void forEach(Test lambda) {	// lambda의 method가 구현되어 있지 않으니 즉석에서 구현함
		String[] arr = new String[] {
				"이지은", "홍진호", "짱구", "단비", "김태리", "유진초이"
		};
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != null) {
				lambda.method(arr[i]);
			}
		}
	}
}


public class Ex01 {
	public static void main(String[] args) {
		Repository repo = new Repository();
		
		repo.forEach(str -> System.out.println(str));
		System.out.println();
		
		repo.forEach(str -> System.out.println(str.length()));
		System.out.println();
		
		Test lambda = (str) -> { 
			String odd = "홀수";
			if(str.length() % 2 ==0) {
				odd = "짝수";
			}
			System.out.println(odd); 
		};
		repo.forEach(lambda);
	}
}
