// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/arrays-begin/challenges/1-array-array-operations-cw/problem?isFullScreen=true
// Problem     1. Array - Array Operations (CW)
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-10-09, 03:25 p.m.
// ──────────────────────────────────────────────────

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        ArrayOperations(arr, n);
    }

    public static void ArrayOperations(int[] arr, int n) {
        long sum = 0;
        int max = arr[0];

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        long average = sum / n;

        System.out.println(sum + " " + average + " " + max);
    }
}
