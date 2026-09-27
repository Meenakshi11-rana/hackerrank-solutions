// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/software-engineer-prep-kit/challenges/count-elements-greater-than-previous-average/problem?isFullScreen=true
// Problem     Count Elements Greater Than Previous Average
// Difficulty  Easy
// Subdomain   Software Engineer Prep Kit
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-09-27, 05:51 p.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    public static int countResponseTimeRegressions(List<Integer> responseTimes) {

        if (responseTimes == null || responseTimes.isEmpty()) {
            return 0;
        }

        int count = 0;
        long sum = responseTimes.get(0);

        for (int i = 1; i < responseTimes.size(); i++) {

            // responseTimes[i] > sum / i
            // Multiply instead to avoid floating-point errors
            if ((long) responseTimes.get(i) * i > sum) {
                count++;
            }

            sum += responseTimes.get(i);
        }

        return count;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int responseTimesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> responseTimes = IntStream.range(0, responseTimesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.countResponseTimeRegressions(responseTimes);

        System.out.println(result);

        bufferedReader.close();
    }
}
