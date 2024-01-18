/*
[평행]

* 문제 설명
  - 주어진 네 개의 점을 두 개씩 이었을 때, 두 직선이 평행이 되는 경우가 있으면 1을
    없으면 0을 return 하도록 solution 함수를 완성해보세요.

* 제한사항
  - dots의 길이 = 4
  - dots의 원소는 [x, y] 형태이며 x, y는 정수입니다.
    - 0 ≤ x, y ≤ 100
  - 서로 다른 두개 이상의 점이 겹치는 경우는 없습니다.
  - 두 직선이 겹치는 경우(일치하는 경우)에도 1을 return 해주세요.
  - 임의의 두 점을 이은 직선이 x축 또는 y축과 평행한 경우는 주어지지 않습니다.
 */

class Solution {
    public int solution(int[][] dots) {
        double[] result = new double[6];
        int cnt = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = i; j < 3; j++) {
                result[cnt] = (double) (dots[i][0] - dots[j + 1][0]) / (dots[i][1] - dots[j + 1][1]);
                cnt++;
            }
        }
        for (int k = 0; k < 2; k++) {
            if (result[k] == result[result.length - 1 - k]) {
                return 1;
            }
        }

        return 0;
    }
}

public class Parallel {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(new int[][]{{1, 4}, {9, 2}, {3, 8}, {11, 6}}));
    }
}

/*
# Another Answer
 */