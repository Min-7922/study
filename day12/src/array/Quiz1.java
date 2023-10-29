package array;

import java.util.Arrays;

public class Quiz1 {
	public static void main(String[] args) {
		
		int[] arr = {9, 54, 23, 72, 99, 85, 31, 16, 49, 62};
		
		// 1) arr에서 홀수의 개수와 짝수의 개수를 각각 변수에 담아서 출력하세요
		int odd=0;	// 홀수
		int even=0;	// 짝수
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]%2 == 0) 	even += 1;
			else 				odd +=1;
		}
		System.out.printf("1번) 홀수의 개수 : %d개, 짝수의 개수 : %d개\n", odd, even);
		
		
		// 2) arr에서 홀수만 골라서 합계를 구한 다음 출력하세요
		int odd_sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2 == 1) {
				odd_sum += arr[i];
			}
		}
		System.out.println("2번) 홀수 합 : " + odd_sum);
		
		
		
		// 3) arr에서 짝수만 골라서 새로운 배열 arr2에 저장하고 출력하세요
		// [] : 배열 생서이에는 길이를 지정한다(리터럴 및 변수 사용 가능)
		//		생성된 배열에 대해 사용하면 길이가 아니라, index를 지정한다
		
		int[] arr2 = new int[even];
		int num1 = 0;	// arr2 index
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==0) {			// arr[i]짝수일 경우
				arr2[num1] = arr[i];	// arr2[0]부터 값을 넣음
				num1++;					// 짝수일 경우에만 arr2 index값 올림
			}
			
		}
		System.out.println("3번) "+Arrays.toString(arr2));
		
		
		
		// 4) arr의 내용을 거꾸로 담은 배열 arr3를 만들어서 출력하세요
		int[] arr3 = new int[arr.length];
		int num2 = arr.length;
		
		for(int i=0; i<arr.length; i++) {
			arr3[num2-1] = arr[i];
			num2--;
		}
		System.out.println("4번) "+Arrays.toString(arr3));
		
		
		
		// 5) arr를 내림차순 정렬한 후 다시 출력하세요
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]<arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		System.out.println("5번) "+Arrays.toString(arr));
		
		
		
		
	}//end of main

}// end of class






