package s21213_01;

import java.util.Scanner;

public class S21213_03v1 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		int x=stdIn.nextInt();
		char grade;
		
		if(x>=90) {
			grade='A';
		}else if(x>=80) {
			grade='B';
		}else if(x>=70) {
			grade='C';
		}else if(x>=60) {
			grade='D';
		}else {
			grade='F';
		}
		
		
		
		
		
		
		System.out.println("당신의 학점은 "+grade+"입니다.");
		
		
	}

}
