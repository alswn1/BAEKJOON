package Basic;

import java.util.*;
import java.io.*;

public class n2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String A = st.nextToken();
        String B = st.nextToken();

        A = "" + A.charAt(2) + A.charAt(1) + A.charAt(0);
        B = "" + B.charAt(2) + B.charAt(1) + B.charAt(0);

        if (Integer.parseInt(A) > Integer.parseInt(B)) System.out.println(A);
        else System.out.println(B);
    }
}
