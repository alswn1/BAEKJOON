package Basic;

import java.util.*;
import java.io.*;

public class n1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toUpperCase();
        int len = str.length();
        int[] count = new int[26];
        for (int i = 0; i < len; i++) count[str.charAt(i) - 'A']++;

        int max = 0;
        char answer = '?';
        for (int j = 0; j < 26; j++) {
            if (max < count[j]) {
                max = count[j];
                answer = (char)(j + 'A');
            }else if (max == count[j]) {
                answer = '?';
            }
        }
        System.out.println(answer);
    }
}