package reference;

// 객체의 참조

class Test6 {	// 정수를 객체 형태로 저장하기 위한 클래스
//	private int num;
	int num;
	
	Test6(int num) {
		this.num = num;
	}
//	public int getNum() {
//		return num;
//	}
//	public void setNum(int num) {
//		this.num = num;
//	}
}

public class Ex06 {
	static void swapInt(int number1, int number2) {
		int tmp = number1;
		number1 = number2;
		number2 = tmp;
	}
	
	static void swapObject(Test6 n3, Test6 n4) {
		int tmp =n3.num;	// tmp = n3;
		n3.num = n4.num;	// n3 = n4;
		n4.num = tmp;			// n4 = tmp;
	}
	
	public static void main(String[] args) {
		
		int n1=10, n2=20;
		System.out.printf("n1 : %d, n2 : %d\n", n1, n2);
		swapInt(n1, n2);
		System.out.printf("n1 : %d, n2 : %d\n", n1, n2);
		System.out.println();
		
		Test6 n3 = new Test6(30);
		Test6 n4 = new Test6(40);
		
		System.out.printf("n3 : %d, n4 : %d\n", n3.num, n4.num);
		swapObject(n3, n4);
		System.out.printf("n3 : %d, n4 : %d\n", n3.num, n4.num);
		System.out.println();
	}

}
