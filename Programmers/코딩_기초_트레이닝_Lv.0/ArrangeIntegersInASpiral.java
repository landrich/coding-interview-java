/*
[정수를 나선형으로 배치하기]

* 문제 설명
  - 양의 정수 n이 매개변수로 주어집니다. n × n 배열에 1부터 n2 까지 정수를 인덱스 [0][0]부터
    시계방향 나선형으로 배치한 이차원 배열을 return 하는 solution 함수를 작성해 주세요.

* 제한사항
  - 1 ≤ n ≤ 30
 */

import java.util.Arrays;

class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int top = 0, left = 0, right = n - 1, bottom = n - 1, cnt = 1;

        while (cnt <= n * n) {
            for (int t = left; t <= right; t++) {
                answer[top][t] = cnt++;
            }
            top++;
            for (int r = top; r <= bottom; r++) {
                answer[r][right] = cnt++;
            }
            right--;
            for (int b = right; b >= left; b--) {
                answer[bottom][b] = cnt++;
            }
            bottom--;
            for (int l = bottom; l >= top; l--) {
                answer[l][left] = cnt++;
            }
            left++;
        }

        return answer;
    }
}

public class ArrangeIntegersInASpiral {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(Arrays.deepToString(sol.solution(10)));
    }
}

/*
# Another Answer
 */