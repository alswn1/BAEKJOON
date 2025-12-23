package Basic;

import java.util.*;
import java.io.*;

public class n1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            LinkedList<int[]> list = new LinkedList<>();
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                list.add(new int[]{i, Integer.parseInt(st.nextToken())});
            }

            int count = 0;
            while (!list.isEmpty()) {
                int[] front = list.poll();
                boolean isMax = true;

                for (int j = 0; j < list.size(); j++) {
                    if (front[1] < list.get(j)[1]) {
                        isMax = false;
                        break;
                    }
                }

                if (isMax) {
                    count++;
                    if (front[0] == M) {
                        sb.append(count).append("\n");
                        break;
                    }
                }
                else list.add(front);
            }
        }
        System.out.print(sb);
    }
}
