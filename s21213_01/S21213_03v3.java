package s21213_01;

import java.util.Scanner;

public class S21213_03v3 {

	public static void main(String[] args) {
		
		Scanner stdIn=new Scanner(System.in);
		
		System.out.printf("구구단을 기본으로 몇 단까지 할까요:");
		int x =stdIn.nextInt();
		
		for(int i=1;i<=x;i++) {
			System.out.println();
			System.out.println(i+"단 입니다.\n");
			for(int j=1;j<=9;j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
		}
		
//		int cnt = 1;
//		int sum = 0;
		
//		while(cnt<=10) {
//			sum=sum+cnt;
//			cnt++;
//			
//		}
//		System.out.println("sum:"+sum);
		
		
//		do {
//			
//			sum=sum+cnt;
//			cnt++;
//			
//			
//			
//			
//			
//		}while(cnt<=10);
//		System.out.println("sum:"+sum);
//		
		
		
		
		
		
		
		
		
	}

}
