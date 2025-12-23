package Mathematics;

import java.util.*;
import java.io.*;

public class n1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), "-");

        int answer = 0;
        boolean isFirstGroup = true;

        while (st.hasMoreTokens()) {
            int tempSum = 0;
            StringTokenizer st2 = new StringTokenizer(st.nextToken(), "+");

            while (st2.hasMoreTokens()) {
                tempSum += Integer.parseInt(st2.nextToken());
            }

            if (isFirstGroup) {
                answer = tempSum;
                isFirstGroup = false;
            }else {
                answer -= tempSum;
            }
        }
        System.out.println(answer);
    }
}
