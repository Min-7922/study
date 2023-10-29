package array;

import java.util.Scanner;

public class Ex09_copy {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[2];
		int[] tmp;
		
		LOOP : while(true) {
			
			for(int i=0; i<arr.length; i++) {
				if(arr[i] == 0) {
					System.out.print("정수 입력 : ");
					arr[i] = sc.nextInt();
					if(arr[i]==0) {
						break LOOP;
					}
				}
			}
			
			tmp = new int[arr.length+1];
			for(int i = 0; i<arr.length; i++) {
				tmp[i] = arr[i];
			}
			arr = tmp;
			
		}// end of while
		
	}
}
