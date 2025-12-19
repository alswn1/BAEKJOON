package Basic;

import java.util.*;
import java.io.*;

public class n3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            if (i <= 1) sb.append(1-Integer.parseInt(st.nextToken())).append(" ");
            else if (i <= 4) sb.append(2-Integer.parseInt(st.nextToken())).append(" ");
            else sb.append(8-Integer.parseInt(st.nextToken())).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
