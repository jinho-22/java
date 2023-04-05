package s21213_01;
import java.util.*;
import java.io.*;
public class S21213_Gugudan_v1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int sc=0;
		
		
		
		int x,y;
		Random r=new Random();
		
		
		x=r.nextInt(24)+2;
		y=r.nextInt(9)+1;
		
		System.out.println("* 구구단 "+x+"단에 대한 문제입니다.");
		
		System.out.print(x+" * "+y+" = ");
		sc=scanner.nextInt();
		if(x*y==sc) {
			System.out.println("맞");
		}else {
			System.out.println("틀");
		}
		
		
		
		
		
	}

}
