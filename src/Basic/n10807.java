package Basic;

import java.util.*;
import java.io.*;

public class n10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int findnm = Integer.parseInt(br.readLine());
        int answer = 0;
        for (int i = 0; i < cnt; i++) {
            if (findnm == Integer.parseInt(st.nextToken())) answer++;
        }
        System.out.println(answer);
    }
}
