package Basic;

import java.io.*;
import java.util.*;

public class n25314 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();
        n /= 4;

        StringBuilder sb = new StringBuilder();
        sb.append("long ".repeat(Math.max(0, n)));
        sb.append("int");
        System.out.println(sb);
    }
}