package Simulation;

import java.util.*;
import java.io.*;

public class n16236 {
    static int N;
    static int[][] map;
    static int[] dx = {0, -1, 1, 0};
    static int[] dy = {-1, 0, 0, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        int[] cur = null;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (map[i][j] == 9) {
                    cur = new int[] {i, j};
                    map[i][j] = 0;
                }
            }
        }

        int size = 2;
        int eat = 0;
        int move = 0;

        while(true) {
            PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> {
                if (o1[2] != o2[2]) return Integer.compare(o1[2], o2[2]);
                if (o1[0] != o2[0]) return Integer.compare(o1[0], o2[0]);
                return Integer.compare(o1[1], o2[1]);
            });
            boolean[][] visit = new boolean[N][N];

            pq.add(new int[] {cur[0], cur[1], 0});  // y좌표, x좌표, 거리
            visit[cur[0]][cur[1]] = true;

            boolean check = false;

            while(!pq.isEmpty()) {
                cur = pq.poll();

                if (map[cur[0]][cur[1]] != 0 && map[cur[0]][cur[1]] < size) {
                    map[cur[0]][cur[1]] = 0;
                    eat++;
                    move += cur[2];
                    check = true;
                    break;
                }

                for (int i = 0; i < 4; i++) {
                    int nx = cur[1] + dx[i];
                    int ny = cur[0] + dy[i];

                    if (nx < 0 || nx >= N || ny < 0 || ny >= N || visit[ny][nx] || map[ny][nx] > size) continue;
                    pq.add(new int[] {ny, nx, cur[2] + 1});
                    visit[ny][nx] = true;
                }
            }
            if (!check) break;

            if (size == eat) {
                size++;
                eat = 0;
            }
        }
        System.out.println(move);
    }
}