import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

	   int n = sc.nextInt();
	   for (int i = 0; i < n; i++) {
		   int a = sc.nextInt();
		  
		   int quater = a / 25;
		   a %= 25;

		   int dime = a / 10;
		   a %= 10;

		   int nickel = a / 5;
		   a %= 5;

		   int penny = a;

		   System.out.println(quater + " " + dime + " " + nickel + " " + penny);
		   
	   }
    }

}