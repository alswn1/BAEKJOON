package Basic;

import java.util.*;
import java.io.*;

public class n2444 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        for (int i = 1; i <= 2*N-1; i++) {
            int spaces = Math.abs(N - i);
            int stars = (2 * N - 1) - (2 * spaces);

            sb.append(" ".repeat(spaces))
              .append("*".repeat(stars))
              .append("\n");
        }
        System.out.print(sb);
    }
}
