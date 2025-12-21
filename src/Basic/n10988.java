package Basic;

import java.util.*;
import java.io.*;

public class n10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = br.readLine().toCharArray();
        int length = arr.length;
        int mid = (int)(length / 2);
        boolean flag = true;

        for (int i = 0; i < mid; i++) {
            if (arr[i] != arr[length - 1 - i]) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}