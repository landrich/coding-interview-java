/*
[조건에 맞게 수열 변환하기 1]

* 문제 설명
  - 정수 배열 arr가 주어집니다. arr의 각 원소에 대해 값이 50보다 크거나 같은 짝수라면 2로 나누고,
    50보다 작은 홀수라면 2를 곱합니다. 그 결과인 정수 배열을 return 하는 solution 함수를 완성해 주세요.

* 제한사항
  - 1 ≤ arr의 길이 ≤ 1,000,000
  - 1 ≤ arr의 원소의 값 ≤ 100
 */

import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];

        for (int i = 0; i < answer.length; i++) {
            if (arr[i] >= 50 && arr[i] % 2 == 0) answer[i] = arr[i] / 2;
            else if (arr[i] < 50 && arr[i] % 2 == 1) answer[i] = arr[i] * 2;
            else answer[i] = arr[i];
        }

        return answer;
    }
}

public class ConvertASequenceAccordingToConditions1 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.solution(new int[]{1, 2, 3, 100, 99, 98})));
    }
}

/*
# Another Answer
 */