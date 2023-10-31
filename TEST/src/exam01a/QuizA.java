package exam01a;
// 선택정렬 함수 --> 오름차순
// 중복없는 랜덤(1~45) 정수 6개로 구성된 배열을 반환하는 함수를 만들어야 한다 ( 랜덤 정수 중복X )
// 한 줄당 6개, 총 5줄의 정수를 출력하는 프로그램을 작성 (길이 6의 배열 5개)

// 
import java.util.Random;

public class QuizA {
	
	static void randomArray(int[] arr) { // 랜덤정수 6개로 구성된 배열을 반환하는 함수
		Random ran = new Random();
		int num = 0;
		
		while(num != 6) { 
			arr[num] = ran.nextInt(45)+1;	
			num++;
			
			for(int i=0; i<num; i++) {	// 중복시 다시 랜덤값을 받을 수 있게하는 for문 (중복제거)
				for(int j=i+1; j<num; j++) {  
					if(arr[i]==arr[j]) {	
						num--;
					}
				}
			}
		}// end of while
	} 
	
	
	static void ascendingOrder(int[] arr) {	// 선택정렬 함수 (배열을 오름차순으로 바꿔주는 함수)
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}
	
	
	static void printArray(int[] arr) {	// 배열을 []없이 정렬하여 출력하는 함수
		for(int i=0; i<arr.length; i++) {	
			if(i==arr.length-1) {
				System.out.printf("%2d\n",arr[i]);
			}
			else {
				System.out.printf("%2d, ",arr[i]);
			}
		}
	}
	
	
	// main()
	public static void main(String[] args) { 
		
		System.out.println("응시자 : 황민정\n");
		
		
		for(int i=0; i<5; i++) {
			int[] arr = new int[6];	
			
			// 랜덤정수 6개로 구성된 배열을 반환
			randomArray(arr);	
			
			// 선택 정렬 함수 - 오름차순
			ascendingOrder(arr); 
			
			// 출력
			printArray(arr);
		}
			
	}// end of main

}// end of class





