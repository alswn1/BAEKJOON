package Basic;

import java.io.*;
import java.util.*;

public class n25304 {
    static void main() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = Integer.parseInt(br.readLine());
        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            sum -= Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
        }

        if (sum == 0) System.out.println("Yes");
        else System.out.println("No");
    }
}
