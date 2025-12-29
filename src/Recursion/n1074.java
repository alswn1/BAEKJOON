package Recursion;

import java.util.*;
import java.io.*;

public class n1074 {
    static int answer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int size = (int) Math.pow(2, n);
        find(size, r, c);
        System.out.println(answer);
    }

    static void find(int size, int r, int c) {
        if (size == 1) {
            return;
        }
        int half = size / 2;

        if (r < half && c < half) {
            find(half, r, c);
        } else if (r < half && c >= half) {
            answer += (half*half);
            find(half, r, c - half);
        }else if (r >= half && c < half) {
            answer += (2*half*half);
            find(half, r - half, c);
        }else {
            answer += (3*half*half);
            find(half, r - half, c - half);
        }
    }
}
