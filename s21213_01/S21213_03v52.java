package s21213_01;
import java.util.Scanner;
public class S21213_03v52 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String[] s_day;
		s_day = new String[5];
		
		s_day[0] = "(1) 월요일이 좋다";
		s_day[1] = "(2) 화요일이 좋다";
		s_day[2] = "(3) 수요일이 좋다";
		s_day[3] = "(4) 목요일이 좋다";
		s_day[4] = "(5) 금요일이 좋다";
		int menu = 0;
		
		while(true) {
			for(int i=0; i<s_day.length;i++) {
				System.out.println(s_day[i]);
			}
				
			System.out.println("좋아하는 날을 선택합니다 (종료:0)");
			menu = scanner.nextInt();
			if(menu == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else if(!(1<=menu&&menu<=5)) {
				System.out.println("정확히 입력하세요.");
				continue;
			}
			System.out.print("선택하신 것은 '"+s_day[menu-1]+"'입니다.");
			break;
		}
		
		
	}

}
