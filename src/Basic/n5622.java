package Basic;

import java.util.*;
import java.io.*;

public class n5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> call = new HashMap<>();
        call.put("A", 3); call.put("B", 3); call.put("C", 3);
        call.put("D", 4); call.put("E", 4); call.put("F", 4);
        call.put("G", 5); call.put("H", 5); call.put("I", 5);
        call.put("J", 6); call.put("K", 6); call.put("L", 6);
        call.put("M", 7); call.put("N", 7); call.put("O", 7);
        call.put("P", 8); call.put("Q", 8); call.put("R", 8); call.put("S", 8);
        call.put("T", 9); call.put("U", 9); call.put("V", 9);
        call.put("W", 10); call.put("X", 10); call.put("Y", 10); call.put("Z", 10);

        char[] str = br.readLine().toCharArray();
        int sum = 0;
        for (char c : str) sum += call.get(String.valueOf(c));
        System.out.println(sum);
    }
}
