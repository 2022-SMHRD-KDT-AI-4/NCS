import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Ã¹¹øÂ° Ä¿¹Ô");
		System.out.println("µÎ¹øÂ° Ä¿¹Ô");
		System.out.println("´Ù¼¸¹øÂ° Ä¿¹Ô");
		
		for(int i =0; i<10;i++) {
			System.out.println("¼¼¹øÂ° Ä¿¹Ô");
		}
		System.out.println("³×¹øÂ° Ä¿¹Ô");

		System.out.println("7¹øÂ° Ä¿¹Ô");
		
		String input = sc.next();
		for(int i = 0 ; i<10;i++) {
			for(int j = 0;j<i;j++) {
			System.out.println(input);
			}
			System.out.println();
		}
		
		
		
	}

}
