package Simulation;

import java.util.*;
import java.io.*;

public class n14891 {
    static Deque<Integer>[] gears = new ArrayDeque[5];     // {톱니(0: N극, 1: S극)}

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 1; i <= 4; i++) {
            gears[i] = new ArrayDeque<>();
            String line = br.readLine();
            for (int j = 0; j < 8; j++) {
                gears[i].add(line.charAt(j) - '0');
            }
        }

        int k = Integer.parseInt(br.readLine());    // {회전 톱니 번호, 방향(1:시계, -1:반시계)}
        for (int i = 0; i < k; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int targetIdx = Integer.parseInt(st.nextToken());
            int direction = Integer.parseInt(st.nextToken());

            int[] rotateDir = new int[5];
            rotateDir[targetIdx] = direction;

            for (int j = targetIdx; j > 1; j--) {
                if (getNS(j, 6) != getNS(j-1, 2)) {
                    rotateDir[j-1] = -rotateDir[j];
                }else break;
            }

            for (int j = targetIdx; j < 4; j++) {
                if (getNS(j, 2) != getNS(j+1, 6)) {
                    rotateDir[j+1] = -rotateDir[j];
                }else break;
            }

            for (int j = 1; j <= 4; j++) {
                if (rotateDir[j] != 0) {
                    rotateGear(j, rotateDir[j]);
                }
            }
        }

        int total = 0;
        if (getNS(1, 0) == 1) total += 1;
        if (getNS(2, 0) == 1) total += 2;
        if (getNS(3, 0) == 1) total += 4;
        if (getNS(4, 0) == 1) total += 8;

        System.out.println(total);
    }

    static int getNS(int gearIdx, int pos) {
        List<Integer> list = new ArrayList<>(gears[gearIdx]);
        return list.get(pos);
    }

    static void rotateGear(int gearIdx, int dir) {
        if (dir == 1) {
            gears[gearIdx].addFirst(gears[gearIdx].removeLast());
        }else {
            gears[gearIdx].addLast(gears[gearIdx].removeFirst());
        }
    }

}
