/*
[등수 매기기]

* 문제 설명
  - 영어 점수와 수학 점수의 평균 점수를 기준으로 학생들의 등수를 매기려고 합니다.
    영어 점수와 수학 점수를 담은 2차원 정수 배열 score가 주어질 때, 영어 점수와 수학 점수의
    평균을 기준으로 매긴 등수를 담은 배열을 return하도록 solution 함수를 완성해주세요.

* 제한사항
  - 0 ≤ score[0], score[1] ≤ 100
  - 1 ≤ score의 길이 ≤ 10
  - score의 원소 길이는 2입니다.
  - score는 중복된 원소를 갖지 않습니다.
 */

import java.util.Arrays;

class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        double rank = 0, compareRank = 0;
        int cnt = 1;

        for (int i = 0; i < score.length; i++) {
            cnt = 1;
            rank = (score[i][0] + score[i][1]) / 2.0;
            for (int j = 0; j < score.length; j++) {
                compareRank = (score[j][0] + score[j][1]) / 2.0;
                if (rank < compareRank) cnt++;
            }
            answer[i] = cnt;
        }

        return answer;
    }
}

public class Ranking {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.solution(new int[][]{{80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}})));
    }
}

/*
# Another Answer
 */