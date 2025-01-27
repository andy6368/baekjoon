import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

	   int n = sc.nextInt();
	   if(n == 1) {
		System.out.println(9);
	   }
	   else {
		System.out.println((int)Math.pow(Math.pow(2, n)+1, 2));
	   }

    }

}