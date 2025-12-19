package Basic;

import java.util.*;
import java.io.*;

public class n10811 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = i+1;
        }

        for (int j = 0; j < M; j++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken())-1;
            int b = Integer.parseInt(st.nextToken())-1;

            while (a < b) {
                int temp = arr[a];
                arr[a] = arr[b];
                arr[b] = temp;
                a++; b--;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int num : arr) sb.append(num).append(" ");
        System.out.println(sb.toString().trim());
    }
}
