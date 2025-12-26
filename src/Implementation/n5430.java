package Implementation;

import java.util.*;
import java.io.*;

public class n5430 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while(T-- > 0) {
            String func = br.readLine();
            int n = Integer.parseInt(br.readLine());

            StringTokenizer st = new StringTokenizer(br.readLine(), "[],");
            Deque<Integer> stack = new ArrayDeque<>();
            while(n-- > 0) stack.add(Integer.parseInt(st.nextToken()));

            boolean isReversed = false;
            boolean isError = false;

            for (char f : func.toCharArray()) {
                if (f == 'R') {
                    isReversed = !isReversed;
                }else {
                    if (stack.isEmpty()) {
                        isError = true;
                        break;
                    }
                    if (isReversed) {
                        stack.pollLast();
                    }else {
                        stack.pollFirst();
                    }
                }
            }

            if (isError) sb.append("error\n");
            else makeString(stack, isReversed, sb);
        }
        System.out.print(sb);
    }

    static void makeString(Deque<Integer> stack, boolean isReversed, StringBuilder sb) {
        sb.append("[");
        while(!stack.isEmpty()) {
            sb.append(isReversed ? stack.pollLast() : stack.pollFirst());
            if (!stack.isEmpty()) sb.append(",");
        }
        sb.append("]\n");
    }
}
