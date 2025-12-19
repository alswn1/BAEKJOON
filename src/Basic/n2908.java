package Basic;

import java.util.*;
import java.io.*;

public class n2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String A = new StringBuilder(st.nextToken()).reverse().toString();
        String B = new StringBuilder(st.nextToken()).reverse().toString();

        if (Integer.parseInt(A) > Integer.parseInt(B)) System.out.println(A);
        else System.out.println(B);
    }
}
