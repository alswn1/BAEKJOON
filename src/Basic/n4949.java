package Basic;

import java.util.*;
import java.io.*;

public class n4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        StringBuilder sb = new StringBuilder();
        while(!(str = br.readLine()).equals(".")) {
            ArrayDeque<Character> st = new ArrayDeque<>();
            boolean isBalanced = true;

            for (char c : str.toCharArray()) {
                if (c == '(' || c == '[') st.push(c);
                else if (c == ')') {
                    if (st.isEmpty() || st.pop() != '(') {
                        isBalanced = false;
                        break;
                    }
                }else if (c == ']') {
                    if (st.isEmpty() || st.pop() != '[') {
                        isBalanced = false;
                        break;
                    }
                }
            }

            if (isBalanced && st.isEmpty()) sb.append("yes\n");
            else sb.append("no\n");
        }
        System.out.print(sb);
    }
}
