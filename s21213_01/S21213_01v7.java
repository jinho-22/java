package s21213_01;

import java.util.Scanner;

public class S21213_01v7 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		int intVal;
		double douVal;
		String strVal;
		
		
		System.out.printf("1문장을 입력하세욧:");
		strVal=stdIn.nextLine();
		
		System.out.printf("2정수를 입력하세욧:");
		intVal=stdIn.nextInt();
		
		System.out.printf("3실수를 입력하세욧:");
		douVal=stdIn.nextDouble();
		
		
		System.out.println("1입력한 문장은 "+strVal+"입니다.");
		System.out.println("2입력한 문장은 "+intVal+"입니다.");
		System.out.println("3입력한 문장은 "+douVal+"입니다.");
	}

}
