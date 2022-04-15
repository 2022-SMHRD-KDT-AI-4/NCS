import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 커밋");
		System.out.println("두번째 커밋");
		System.out.println("다섯번째 커밋");
		
		for(int i =0; i<10;i++) {
			System.out.println("세번째 커밋");
		}
		System.out.println("네번째 커밋");

		System.out.println("7번째 커밋");
		
		System.out.println("피라미드에 들어갈 별모양을 입력하시오 : ");
		String input = sc.next();
		for(int i = 0 ; i<10;i++) {
			for(int j = 0;j<i;j++) {
			System.out.println(input);
			}
			System.out.println();
		}
		
		
		
	}

}
