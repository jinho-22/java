package s21213_01;
import java.util.Scanner;
public class S21213_03v51 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		String day_s1 = "(1) 월요일이 좋다.";
		String day_s2 = "(2) 화요일이 좋다.";
		String day_s3 = "(3) 수요일이 좋다.";
		String day_s4 = "(4) 목요일이 좋다.";
		String day_s5 = "(5) 금요일이 좋다.";
		
		int menu=0;
		
		
		while(true) {
			
			String tmp = scanner.nextLine();
			menu = Integer.parseInt(tmp);
			
			if(menu==0) {
				System.out.println("프로그램을 종료합니다.");
			}else if(!(1<=menu&&menu<=4)) {
				System.out.println("정확히 입력하세요.");
				continue;
			}
			System.out.println("선택하신 것은");
			
			switch(menu) {
			
			case 1:
				System.out.println("'"+day_s1+"' 입니다.");
			break;
			case 2:
				System.out.println("'"+day_s2+"' 입니다.");
			break;
			case 3:
				System.out.println("'"+day_s3+"' 입니다.");
			break;
			case 4:
				System.out.println("'"+day_s4+"' 입니다.");
			break;
			case 5:
				System.out.println("'"+day_s5+"' 입니다.");
			break;
			}
			
			
		}
	}

}
