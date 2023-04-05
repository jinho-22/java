package s21213_01;

import java.util.Scanner;

public class S21213_03v2 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		System.out.printf("현재 월을 입력하세요 : ");
		int month = stdIn.nextInt();
		
		switch(month) {
		
		
		case 3:
		case 4:
		case 5:
			System.out.println("현재의 계절은 봄입니다.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("현재의 계절은 여름입니다.");
			break;
		case 9:
		case 10:
		
			System.out.println("현재의 계절은 가을입니다.");
			break;
		case 11:
		case 12:
		case 1:
		case 2:
			System.out.println("현재의 계절은 겨울입니다.");
			break;
			
		default:
			System.out.println("스위찌");
		}
		
	}

}
