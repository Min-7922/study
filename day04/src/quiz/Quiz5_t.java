package quiz;
import java.util.Random;
import java.util.Scanner;

public class Quiz5_t {
	public static void main(String[] args) {
		
		// 현재 자신의 위치를 1~15 사이로 입력한 다음
		// 가장 가까운 엘리베이터가 몇번째인지 출력하는 코드를 작성하세요
		// (가장 가깝다 = 거리값이 최소이다 = 차이의 절대값이 최소값이다)
			
			Random ran = new Random();
			int eleA, eleB, eleC;
			int current;
			int distA, distB, distC;
			int min;
			Scanner sc = new Scanner(System.in);
			
			eleA = ran.nextInt(15) + 1;	// 1~15
			eleB = ran.nextInt(15) + 1; // 1~15
			eleC = ran.nextInt(15) + 1; // 1~15
			
			System.out.printf("%d, %d, %d\n", eleA, eleB, eleC);
			
			
			System.out.print("현재 층을 입력하세요 : ");
			current = sc.nextInt();
			
			distA = current - eleA;
			distB = current - eleB;
			distC = current - eleC;
			
			if(distA <0) distA = -distA;
			if(distB <0) distB *= -1;
			if(distC <0) distC *= -1;
			
			if(true)		min = distA;
			if(min>distB)	min = distB;
			if(min>distC)	min = distC;
			
			if (min == distA)			System.out.println("A엘리베이터가 이동합니다");
			else if (min == distA)		System.out.println("B엘리베이터가 이동합니다");
			else /*if(min == distA)*/	System.out.println("C엘리베이터가 이동합니다");
			
			
			
			
			

	}
	
}
