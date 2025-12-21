package Basic;

import java.util.*;
import java.io.*;

public class n1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int answer = 0;

        for (int i = 0; i < N; i++) {
            boolean[] alpCheck = new boolean[26];
            char[] str = br.readLine().toCharArray();
            char before = 0;
            boolean flag = true;
            for (char c : str) {
                if (!alpCheck[c-'a']) {
                    alpCheck[c-'a'] = true;
                    before = c;
                } else if (before != c) {
                    flag = false;
                    break;
                }else continue;
            }

            if (flag) answer++;
        }
        System.out.println(answer);
    }
}
