package loop;

public class Ex09 {
	public static void main(String[] args) {
		
		// 1) 1부터 5까지 한줄에 출력하기
		for(int i=1; i<=5; i++) {
			System.out.print(i + " ");
			
		}System.out.println("\n");
		
		
		
		// 2) 1부터 5까지 한줄 출력코드를 다시 5번 출력하기
		for(int i=0; i<5; i++) {
			
			for(int j=1; j<=5; j++) {
				System.out.print(j+" ");
			}// 1~5 까지 출력
			
			System.out.println();	// 개행
		}	// 위 for문(j)을 (+개행) 5번 반복
		
		
		System.out.println();
		
		
		
		// 3) 다른 변수를 만들어두고 1부터 25까지 5x5 크기로 출력하기
		int num = 1;
		for(int i=0; i<5; i++) {
			
			for(int j=0; j<5; j++) {	// 5번 반복
				System.out.printf("%2d ", num);	// num출력
				num ++;							// num값 +1
				
			}
			System.out.println();	// 개행
		}
		
		
		System.out.println();
		
		
		// 4) (i, j)번쨰 칸에 원하는 글자를 출력하기
		for(int i=0; i<5; i++) {		// i --> 행
			
			for(int j=0; j<5; j++) {	// j --> 열	
				
				if(i%2==1 && j%2==1 || i%2==0 && j%2==0) {	
//				if(n1 % 2 ==1) {
//				if((i+j) % 2 == 0) {					
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
		
	
			
			
	}

}







