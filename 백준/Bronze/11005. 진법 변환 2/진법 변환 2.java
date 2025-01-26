import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        while (n > 0) {
            if (n % b >= 10) {
                sb.append((char) ((n % b) + 55));
            } else {
                sb.append(n % b);
            }

            n /= b;
        }

        System.out.println(sb.reverse());
        br.close();
    }

}