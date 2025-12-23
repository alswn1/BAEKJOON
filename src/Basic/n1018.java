package Basic;

import java.util.*;
import java.io.*;

public class n1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        boolean[][] board = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                if (line.charAt(j) == 'W') board[i][j] = true;
                else board[i][j] = false;
            }
        }

        int minCount = 64;
        for (int i = 0; i <= N-8; i++) {
            for (int j = 0; j <= M-8; j++) {
                minCount = Math.min(minCount, getRepairCount(board, i, j));
            }
        }

        System.out.println(minCount);
    }

    private static int getRepairCount(boolean[][] board, int x, int y) {
        int count = 0;
        boolean color = board[x][y];

        for (int i = x; i < x+8; i++) {
            for (int j = y; j < y+8; j++) {
                boolean expectedColor = ((i + j) % 2 == 0);

                if (board[i][j] != expectedColor) count++;
            }
        }
        return Math.min(count, 64-count);
    }
}
