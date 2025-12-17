package Basic;

import java.util.*;
import java.io.*;

public class n11021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = Integer.parseInt(br.readLine());

        for (int i = 0; i < cnt; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bw.write("Case #" + (i+1) + ": " + (a+b) + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
