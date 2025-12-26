package Implementation;

import java.util.*;
import java.io.*;

public class n14503 {
    static int N, M;
    static int[][] map;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int cleanArea = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];

        st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        searchingArea(r, c, d);

        System.out.println(cleanArea);
    }

    static void searchingArea(int r, int c, int d) {
        while(true) {
            if (map[r][c] == 0) {
                map[r][c] = 2;
                cleanArea++;
            }

            boolean hasUncleaned = false;
            for (int i = 0; i < 4; i++) {
                int nr = r + dx[i];
                int nc = c + dy[i];

                if (nr >= 0 && nr < N && nc >= 0 && nc < M && map[nr][nc] == 0) {
                    hasUncleaned = true;
                    break;
                }
            }

            if (hasUncleaned) {
                for (int i = 0; i < 4; i++) {
                    d = (d + 3) % 4;
                    int nr = r + dx[d];
                    int nc = c + dy[d];

                    if (nr >= 0 && nr < N && nc >= 0 && nc < M && map[nr][nc] == 0) {
                        r = nr;
                        c = nc;
                        break;
                    }
                }
            } else {
                int backD = (d + 2) % 4;
                int br = r + dx[backD];
                int bc = c + dy[backD];

                if (br >= 0 && br < N && bc >= 0 && bc < M && map[br][bc] != 1) {
                    r = br;
                    c = bc;
                }else {
                    return;
                }
            }
        }
    }
}
