package Basic;

import java.util.*;
import java.io.*;

public class n2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int n = 0;
        String[] alp = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for (String s : alp) {
            if (str.contains(s)) {
                str = str.replaceAll(s, "*");
            }
        }
        System.out.println(str.length());
    }
}
