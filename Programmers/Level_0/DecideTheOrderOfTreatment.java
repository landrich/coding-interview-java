/*
[진료 순서 정하기]

* 문제 설명
  - 외과의사 머쓱이는 응급실에 온 환자의 응급도를 기준으로 진료 순서를 정하려고 합니다.
    정수 배열 emergency가 매개변수로 주어질 때 응급도가 높은 순서대로 진료 순서를 정한 배열을
    return하도록 solution 함수를 완성해주세요.

* 제한사항
  - 중복된 원소는 없습니다.
  - 1 ≤ emergency의 길이 ≤ 10
  - 1 ≤ emergency의 원소 ≤ 100
 */

import java.util.Arrays;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int rank = 1, maxValue = 0, maxIndex = 0;

        for (int i = 0; i < emergency.length; i++) {
            for (int j = 0; j < emergency.length; j++) {
                if (emergency[j] > maxValue) {
                    maxValue = emergency[j];
                    maxIndex = j;
                }
            }
            answer[maxIndex] = rank++;
            emergency[maxIndex] = 0;
            maxValue = 0;
            maxIndex = 0;
        }

        return answer;
    }
}

public class DecideTheOrderOfTreatment {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.solution(new int[]{30, 10, 23, 6, 100})));
    }
}

/*
# Another Answer
 */