package array;


public class Ex03 {
	public static void main(String[] args) {
		
		// 정수형 배열을 참조할 수 있는 참조변수를 생성하고 null로 초기화하세요
		int[] arr = null;
		
//		System.out.println("배역의 길이 : " + arr.length);
		
		// 배열을 리터럴 형식으로 초기화 하는 것은 배열 선언시에만 가능하다!
//		arr = {1, 2, 3, 4, 5};			// 에러
				
		int[] arr2 = new int[]{1, 2, 3, 4, 5};	
		
		arr = new int[] { 1, 3, 5, 7, 9 };
		
		// 배열에는 index가 존재하고 index는 항상 0부터 시작한다
		/*
		 		index [0][1][2][3][4]
		 		arr = {1, 3, 5, 7, 9};
		 		
		 		arr[0] = 1
		 		arr[1] = 3
		 		arr[2] = 5
		 		arr[3] = 7
		 		arr[4] = 9
		 
		 */
		
		System.out.println("arr[0] : " +arr[0]);
		System.out.println("arr[1] : " +arr[1]);
		System.out.println("arr[2] : " +arr[2]);
		System.out.println("arr[3] : " +arr[3]);
		System.out.println("arr[4] : " +arr[4]);
		System.out.println();
		
		for(int i=0; i<5; i++) {	// 위와 완전히 동일한 내용이 출력됨
			System.out.printf("arr[%d] : %d\n", i, arr[i]);
		}	
		System.out.println();
		
		// i번째 칸에 (i+1)*10 값을 대입한다
		for(int i=0; i<5; i++) {
//			System.out.println((i+1)*10);
			arr[i] = (i+1) * 10;
		}
		
		// 값이 바뀌었는지 다시 확인
		for(int i=0; i<5; i++) {	// 위와 완전히 동일한 내용이 출력됨
			System.out.printf("arr[%d] : %d\n", i, arr[i]);
		}	
		System.out.println();
		
		// 1) arr의 각 값에 5씩 더한 이후 출력하세요
		for(int i=0; i<arr.length; i++) {
			arr[i] +=5;
		}
		for(int i=0; i<5; i++) {	
			System.out.printf("arr[%d] : %d\n", i, arr[i]);
		}	
		System.out.println();
		
		// 2) arr의 각 요소(element, member)중에서 3의 배수만 골라서 모두 합친 값을 출력
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%3 == 0) {
				sum += arr[i];
			}
		}
		System.out.println("3의 배수 합계 : " + sum);
		
		
	}

}














