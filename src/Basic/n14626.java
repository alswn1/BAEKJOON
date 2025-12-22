package Basic;

import java.util.*;
import java.io.*;

public class n14626 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = br.readLine().toCharArray();
        int len = arr.length;

        for (int i = 0; i < 10; i++) {
            int sum = 0;
            for (int j = 0; j < len; j++) {
                sum += (arr[j] == '*' ? (j % 2 == 0 ? i : i * 3) : (j % 2 == 0 ? arr[j]-'0' : (arr[j]-'0') * 3));
            }

            if (sum % 10 == 0) {
                System.out.println(i);
                return;
            }
        }
    }
}