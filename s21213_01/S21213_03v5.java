package s21213_01;
import java.util.Scanner;

public class S21213_03v5 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		int menu=0;
		int num=0;
		
		while(true) {
			
			System.out.println("(1) 월요일이 좋다.");
			System.out.println("(2) 수요일이 좋다.");
			System.out.println("(3) 금요일이 좋다.");
			System.out.println("(4) 학교가는 날은 다 좋다.");
			System.out.println("좋아하는 날을 선택하세요 (종료:0)");
			
			String tmp = stdIn.nextLine();
			menu = Integer.parseInt(tmp);
			
			if(menu==0) {
				System.out.println("프로그램을 종료합니다.");
			}else if(!(1<=menu&&menu<=4)) {
				System.out.println("정확히 입력하세요.");
				continue;
			}
			System.out.println("선택하신 번호는 "+menu+"번 입니다.");
			break;
		}
		
		
		
		
		
		
		
		
		
	}

}
