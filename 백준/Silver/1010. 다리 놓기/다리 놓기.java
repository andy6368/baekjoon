import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        int n;
        int m;
        
        for (int i = 0; i < test; i++) {
            n = scanner.nextInt();
            m = scanner.nextInt();
            mCn(m, n);

        }

        scanner.close();
    }

    public static void mCn(int m, int n) {
        int result = 1;

        for (int i = 1; i<=n; i++) {
            result = result * (m - i + 1) / i;
        }

        System.out.println(result);

    }
}