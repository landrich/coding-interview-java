/*
[구슬을 나누는 경우의 수]

* 문제 설명
  - 머쓱이는 구슬을 친구들에게 나누어주려고 합니다. 구슬은 모두 다르게 생겼습니다.
    머쓱이가 갖고 있는 구슬의 개수 balls와 친구들에게 나누어 줄 구슬 개수 share이 매개변수로 주어질 때,
    balls개의 구슬 중 share개의 구슬을 고르는 가능한 모든 경우의 수를 return 하는 solution 함수를 완성해주세요.

* 제한사항
  - 1 ≤ balls ≤ 30
  - 1 ≤ share ≤ 30
  - 구슬을 고르는 순서는 고려하지 않습니다.
  - share ≤ balls
 */

import java.math.BigInteger;

class Solution {
    public int solution(int balls, int share) {
        return (factorial(balls).divide((factorial(balls - share).multiply(factorial(share))))).intValue();
    }

    public static BigInteger factorial(int n) {
        BigInteger sum = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            sum = sum.multiply(BigInteger.valueOf(i));
        }
        return sum;
    }
}

public class MarbleDistribution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(30, 10));
    }
}

/*
# Another Answer
class Solution {
    public long solution(int balls, int share) {
        share = Math.min(balls - share, share);

        if (share == 0)
            return 1;

        long result = solution(balls - 1, share - 1);
        result *= balls;
        result /= share;

        return result;
    }
}
 */

/*
# Another Answer
class Solution {
    public int solution(int balls, int share) {
        // 2차원 배열을 사용하여 동적 계획법으로 조합 계산
        int[][] dp = new int[balls + 1][share + 1];

        // 각 행의 첫 번째 열은 항상 1
        for (int i = 0; i <= balls; i++) {
            dp[i][0] = 1;
        }

        // 각 행의 첫 번째 행은 iC1 = i
        for (int i = 1; i <= balls; i++) {
            dp[i][1] = i;
        }

        // 동적 계획법을 사용하여 나머지 조합 계산
        for (int i = 2; i <= balls; i++) {
            for (int j = 2; j <= share; j++) {
                dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
            }
        }

        return dp[balls][share];
    }
}
 */