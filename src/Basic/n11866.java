package Basic;

import java.util.*;
import java.io.*;

public class n11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        ArrayDeque<Integer> list = new ArrayDeque<>();
        for (int i = 1; i <= N; i++) {
            list.add(i);
        }

        StringJoiner sj = new StringJoiner(", ", "<", ">");
        while(!list.isEmpty()) {
            for (int j = 0; j < K-1; j++) {
                list.addLast(list.removeFirst());
            }
            sj.add(list.removeFirst().toString());
        }
        System.out.println(sj);
    }
}
