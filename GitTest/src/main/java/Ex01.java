import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("ù��° Ŀ��");
		System.out.println("�ι�° Ŀ��");
		System.out.println("�ټ���° Ŀ��");
		
		for(int i =0; i<10;i++) {
			System.out.println("����° Ŀ��");
		}
		System.out.println("�׹�° Ŀ��");

		System.out.println("7��° Ŀ��");
		
		String input = sc.next();
		for(int i = 0 ; i<10;i++) {
			for(int j = 0;j<i;j++) {
			System.out.println(input);
			}
			System.out.println();
		}
		
		
		
	}

}
