/*
[N의 배수 고르기]

* 문제 설명
  - 정수 n과 정수 배열 numlist가 매개변수로 주어질 때, numlist에서 n의 배수가 아닌 수들을
    제거한 배열을 return하도록 solution 함수를 완성해주세요.

* 제한사항
  - 1 ≤ n ≤ 10,000
  - 1 ≤ numlist의 크기 ≤ 100
  - 1 ≤ numlist의 원소 ≤ 100,000
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int n, int[] numlist) {
        List<Integer> answer = new ArrayList<>();

        for (int i : numlist) {
            if (i % n ==0) answer.add(i);
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }
}

public class ChooseAMultipleOfN {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.solution(3, new int[]{4, 5, 6, 7, 8, 9, 10, 11, 12})));
    }
}

/*
# Another Answer
 */