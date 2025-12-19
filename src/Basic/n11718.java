package Basic;

import java.util.*;
import java.io.*;

public class n11718 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str;
        while ((str = br.readLine()) != null) {
            bw.write(str + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
