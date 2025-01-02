import java.util.Scanner;
public class Main {
 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String a = in.next();
		String b = in.next();

		StringBuffer sba = new StringBuffer(a);
		StringBuffer sbb = new StringBuffer(b);
		String reverse_a = sba.reverse().toString();
		String reverse_b = sbb.reverse().toString();

		int a_int = Integer.parseInt(reverse_a);
		int b_int = Integer.parseInt(reverse_b);

		if(a_int > b_int) {
			System.out.print(a_int);
		}
		else {
			System.out.print(b_int);
		}








	}
}