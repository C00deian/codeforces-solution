package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NextRound {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            int k = sc.nextInt();
            List<Integer> score = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                int s = sc.nextInt();
                score.add(s);
            }
            System.out.println(nextRound(n, k, score));
        }
        private static int nextRound(int n, int k, List<Integer> score) {
            int count = 0;
            int threshold = score.get(k - 1);
            for (int i = 0; i < n; i++) {
                if (score.get(i) >= threshold && score.get(i) > 0) {
                    count++;
                }
            }
            return count;
        }
    }


