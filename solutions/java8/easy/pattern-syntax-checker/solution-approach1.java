// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/pattern-syntax-checker/problem?isFullScreen=true
// Problem     Pattern Syntax Checker
// Difficulty  Easy
// Subdomain   Strings
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-09-19, 09:09 p.m.
// ──────────────────────────────────────────────────

import java.util.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int testCases = Integer.parseInt(in.nextLine());

        while (testCases > 0) {
            String pattern = in.nextLine();

            try {
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }

            testCases--;
        }

        in.close();
    }
}
