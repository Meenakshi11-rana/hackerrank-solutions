-- ──────────────────────────────────────────────────
-- Link        https://www.hackerrank.com/challenges/draw-the-triangle-2/problem?isFullScreen=true
-- Problem     Draw The Triangle 2
-- Difficulty  Easy
-- Subdomain   Alternative Queries
-- Platform    HackerRank
-- Language    mysql
-- Status      Accepted
-- Submitted   2026-10-14, 12:18 a.m.
-- ──────────────────────────────────────────────────

WITH RECURSIVE pattern AS (
    SELECT 1 AS n
    UNION ALL
    SELECT n + 1
    FROM pattern
    WHERE n < 20
)
SELECT REPEAT('* ', n)
FROM pattern;
