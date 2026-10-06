// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/camelcase/problem?isFullScreen=true
// Problem     CamelCase
// Difficulty  Easy
// Subdomain   Strings
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-10-06, 10:23 a.m.
// ──────────────────────────────────────────────────

import java.io.*;

class Result {

    public static int camelcase(String s) {
        int count = 1;

        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                count++;
            }
        }

        return count;
    }
}

public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        int result = Result.camelcase(s);

        System.out.println(result);
    }
}
