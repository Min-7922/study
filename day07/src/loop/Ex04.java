package loop;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String arrow = "↑";
		int distance;
		
		System.out.print("0 ~ 30 입력 : ");
		distance = sc.nextInt();
		
		System.out.println("┌────┬────┬────┬────┬────┬────┐");
		System.out.println("│||||│||||│||||│||||│||||│||||│");
		System.out.println("0    5    10   15   20   25   30");
		String sp = "";
		
		for(int i = 0; i<distance; i++) {
			
			sp += " ";
			
			}
		
		System.out.println(sp + arrow);
		sc.close();
		
		
	}

}
