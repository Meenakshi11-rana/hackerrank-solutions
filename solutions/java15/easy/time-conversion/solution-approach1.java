// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/time-conversion/problem?isFullScreen=true
// Problem     Time Conversion
// Difficulty  Easy
// Subdomain   Warmup
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-10-06, 10:52 a.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {

    public static String timeConversion(String s) {

        String period = s.substring(8, 10);
        int hour = Integer.parseInt(s.substring(0, 2));

        if (period.equals("AM")) {
            if (hour == 12) {
                hour = 0;
            }
        } else {
            if (hour != 12) {
                hour += 12;
            }
        }

        return String.format("%02d", hour) + s.substring(2, 8);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(System.in));

        String s = bufferedReader.readLine();

        String result = timeConversion(s);

        System.out.println(result);

        bufferedReader.close();
    }
}
