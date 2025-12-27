package Simulation;

import java.util.*;
import java.io.*;

public class n3190 {
    static StringTokenizer st;
    static int[][] map;
    static int startX = 0, startY = 0, d = 0;
    static int[] dx = {0, -1, 0, 1};
    static int[] dy = {1, 0, -1, 0};
    static int time = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());
        map = new int[N][N];

        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken())-1;
            int y = Integer.parseInt(st.nextToken())-1;
            map[x][y] = 1;
        }

        int L = Integer.parseInt(br.readLine());
        char[] commands = new char[10001];
        for (int i = 0; i < L; i++) {
            st = new StringTokenizer(br.readLine());
            int sec = Integer.parseInt(st.nextToken());
            commands[sec] = st.nextToken().charAt(0);
        }

        Deque<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{0, 0});
        map[0][0] = 2;

        while(true) {
            time++;
            startX += dx[d];
            startY += dy[d];

            if (startX < 0 || startX >= N || startY < 0 || startY >= N || map[startX][startY] == 2) break;

            if (map[startX][startY] != 1) {
                int[] tail = queue.pollFirst();
                map[tail[0]][tail[1]] = 0;
            }
            map[startX][startY] = 2;
            queue.addLast(new int[]{startX, startY});

            if (commands[time] == 'L') {
                d = (d + 1) % 4;
            }else if (commands[time] == 'D') {
                d = (d + 3) % 4;
            }
        }

        System.out.println(time);
    }
}
