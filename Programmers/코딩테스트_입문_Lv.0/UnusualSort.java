/*
[특이한 정렬]

* 문제 설명
  - 정수 n을 기준으로 n과 가까운 수부터 정렬하려고 합니다. 이때 n으로부터의 거리가 같다면 더 큰 수를
    앞에 오도록 배치합니다. 정수가 담긴 배열 numlist와 정수 n이 주어질 때 numlist의 원소를 n으로부터
    가까운 순서대로 정렬한 배열을 return하도록 solution 함수를 완성해주세요.

* 제한사항
  - 1 ≤ n ≤ 10,000
  - 1 ≤ numlist의 원소 ≤ 10,000
  - 1 ≤ numlist의 길이 ≤ 100
  - numlist는 중복된 원소를 갖지 않습니다.
 */

import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        int[][] numArr = new int[numlist.length][2];

        for (int i = 0; i < numlist.length; i++) {
            numArr[i][0] = numlist[i];
            numArr[i][1] = Math.abs(numlist[i] - n);
        }

        Arrays.sort(numArr, Comparator.<int[]>comparingInt(i -> i[1])
                .thenComparing(Comparator.<int[]>comparingInt(i -> i[0]).reversed()));

        for (int i = 0; i < numlist.length; i++) {
            answer[i] = numArr[i][0];
        }

        return answer;
    }
}

public class UnusualSort {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.solution(new int[]{1, 2, 3, 4, 5, 6}, 4)));
    }
}

/*
# Another Answer
 */