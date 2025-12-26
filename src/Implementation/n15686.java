package Implementation;

import java.util.*;
import java.io.*;

public class n15686 {
    static int N, M;
    static List<int[]> houses = new ArrayList<>();
    static List<int[]> chickens = new ArrayList<>();
    static int minCityDistance = Integer.MAX_VALUE;
    static boolean[] selected;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

         N = Integer.parseInt(st.nextToken());
         M = Integer.parseInt(st.nextToken());

         for (int i = 0; i < N; i++) {
             st = new StringTokenizer(br.readLine());
             for (int j = 0; j < N; j++) {
                 int val = Integer.parseInt(st.nextToken());
                 if (val == 1) houses.add(new int[]{i, j});
                 else if (val == 2) chickens.add(new int[]{i, j});
             }
         }

         selected = new boolean[chickens.size()];
         backtrack(0, 0);

         System.out.println(minCityDistance);
    }

    static void backtrack(int start, int count) {
        if (count == M) {
            calculateDistance();
            return;
        }

        for (int i = start; i < chickens.size(); i++) {
            selected[i] = true;
            backtrack(i + 1, count + 1);
            selected[i] = false;
        }
    }

    static void calculateDistance() {
        int cityDistance = 0;

        for (int[] house : houses) {
            int minHouseDistance = Integer.MAX_VALUE;
            for (int i = 0; i < chickens.size(); i++) {
                if (selected[i]) {
                    int[] chicken = chickens.get(i);
                    int dist = Math.abs(chicken[0] - house[0]) + Math.abs(chicken[1] - house[1]);
                    minHouseDistance = Math.min(minHouseDistance, dist);
                }
            }
            cityDistance += minHouseDistance;
            if (cityDistance >= minCityDistance) return;
        }
        minCityDistance = Math.min(minCityDistance, cityDistance);
    }
}
