import java.util.Scanner;
public class Main {
 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String s = in.nextLine();
		int count = 0;

		for (int i = 0; i <s.length();i++) {
			if(s.charAt(i) == ' ') {
				count++; 
			}
		}
		if(s.charAt(0)==' ') {
			count--;
		}
		if(s.charAt(s.length()-1)==' ') {
			count--;
		}
		System.out.println(count+1);
		
	}
}