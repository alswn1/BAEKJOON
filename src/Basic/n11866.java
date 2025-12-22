package Basic;

import java.util.*;
import java.io.*;

public class n11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            list.add(i);
        }

        StringJoiner sj = new StringJoiner(", ", "<", ">");
        int index = 0;
        while(!list.isEmpty()) {
            index = (index + K-1) % list.size();
            sj.add(list.remove(index).toString());
        }
        System.out.println(sj);
    }
}