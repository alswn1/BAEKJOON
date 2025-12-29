package Recursion;

import java.io.*;
import java.util.*;

public class n1629 {
    static int answer = 0;
    static int a, b, c;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        System.out.println(power(a, b));
    }

    static long power(int a, int b) {
        if (b == 1) {
            return a % c;
        }

        long half = power(a, b/2);

        if (b % 2 == 0) {
            return (half * half) % c;
        }else {
            return (((half * half) % c) * a) % c;
        }
    }
}
