import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner	sc = new Scanner(System.in);

		String str = sc.nextLine();

		palindrome(str);

		


		
		
		sc.close();
	}

	static void palindrome(String str) {
		for(int i = 0; i < str.length()/2;i++) {
			char front = str.charAt(i);
			char back = str.charAt(str.length()-1-i);

			if(front != back) {
				System.out.println(0);
				return;
			}
		}
		System.out.println(1);
	}
}