import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1107 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        @SuppressWarnings("MismatchedReadAndWriteOfArray")
        boolean[] isBroken = new boolean[10];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        while (M-- > 0) {
            isBroken[Integer.parseInt(st.nextToken())] = true;
        }
        int min = Math.abs(N - 100); //+,-만 사용
        System.out.println(min);
    }
}
