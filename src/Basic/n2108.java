package Basic;

import java.util.*;
import java.io.*;

public class n2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] count = new int[8001];

        double sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            sum += num;
            count[num+4000]++;

            if (num > max) max = num;
            if (num < min) min = num;
        }

        StringBuilder sb = new StringBuilder();

        // 산술평균
        sb.append(Math.round(sum / N)).append("\n");

        // 중앙값, 최빈값
        int median = 0;
        int mode = 0;

        int medianCount = 0;
        int maxFreq = 0;
        boolean isSecond = false;

        for (int i = 0; i < 8001; i++) {
            if (count[i] > maxFreq) {
                maxFreq = count[i];
            }
        }

        for (int i = 0; i < 8001; i++) {
            if (count[i] > 0) {
                if (medianCount < (N + 1) / 2) {
                    medianCount += count[i];
                    if (medianCount >= (N + 1) / 2) median = i - 4000;
                }

                if (count[i] == maxFreq) {
                    if (isSecond) {
                        mode = i - 4000;
                        maxFreq = -1;
                    } else {
                        mode = i - 4000;
                        isSecond = true;
                    }
                }
            }
        }
        sb.append(median).append("\n");
        sb.append(mode).append("\n");

        // 범위
        sb.append(max - min).append("\n");

        System.out.println(sb);
    }
}
