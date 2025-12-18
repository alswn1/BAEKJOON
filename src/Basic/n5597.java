package Basic;

import java.util.*;
import java.io.*;

public class n5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[30];
        for (int i = 0; i < 28; i++) {
            int a = Integer.parseInt(br.readLine());
            arr[a-1]++;
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int j = 0; j < 30; j++) {
            if (arr[j] == 0) bw.write((j+1) + "\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
