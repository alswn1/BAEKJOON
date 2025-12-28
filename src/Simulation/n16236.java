package Simulation;

import java.util.*;
import java.io.*;

public class n16236 {
    static int N;
    static int[][] map;
    static int sharkSize = 2;   // 아기 상어 사이즈 (초기값 : 2)
    static int eatCount = 2;    // 먹어야 하는 물고기 개수 (크기 증가)
    static int sharkX, sharkY;     // 아기 상어 시작 위치
    static int time = 0;    // 총 먹는 시간
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (map[i][j] == 9) {
                    start = new int[] {i, j};
                }
            }
        }

        find();
        System.out.println(time);
    }

    // 먹을 수 있는 물고기를 찾는 함수
    static void find() {
        while(true) {
            fish = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (map[i][j] >= 1 && map[i][j] <=8 && map[i][j] < sharkSize) {
                        fish.add(new int[] {i, j});
                    }
                }
            }
            int fishCount = fish.size();

            // 더이상 먹을 수 있는 물고기가 없다면 return
            if (fishCount == 0) return;

            // 초기값을 1번째 물고기로 세팅 (1마리라면 그대로 진행)
            int[] eat = fish.get(0);
            int minLen = Integer.MAX_VALUE;
            if (fishCount > 1) {
                for (int i = 0; i < fishCount; i++) {
                    int len = Math.abs(fish.get(i)[0] - start[0]) + Math.abs(fish.get(i)[1] - start[1]);
                    if (len < minLen) {
                        minLen = len;
                        eat = fish.get(i);
                    }
                }
            }
            time += Math.abs(eat[0] - start[0]) + Math.abs(eat[1] - start[1]);
            map[start[0]][start[1]] = 0;
            map[eat[0]][eat[1]] = 9;
            start = eat;
            eatCount--;
            if (eatCount == 0) {
                sharkSize++;
                eatCount = sharkSize;
            }

        }


    }

    static void count() {

    }
}
