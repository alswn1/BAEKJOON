package Basic;

import java.util.*;
import java.io.*;

public class n1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = Integer.parseInt(br.readLine());
        }

        Stack<Integer> stack = new Stack<>();
        int count = 1;

        for (int j = 0; j < n; j++) {
            int target = list[j];

            while (count <= target) {
                stack.push(count++);
                sb.append("+\n");
            }

            if (!stack.isEmpty() && stack.peek() == target) {
                stack.pop();
                sb.append("-\n");
            }else {
                System.out.println("NO");
                return;
            }
        }
        System.out.print(sb);
    }
}