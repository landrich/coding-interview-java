/*
[배열의 길이를 2의 거듭제곱으로 만들기]

* 문제 설명
  - 정수 배열 arr이 매개변수로 주어집니다. arr의 길이가 2의 정수 거듭제곱이 되도록 arr 뒤에 정수 0을 추가하려고 합니다.
    arr에 최소한의 개수로 0을 추가한 배열을 return 하는 solution 함수를 작성해 주세요.

* 제한사항
  - 1 ≤ arr의 길이 ≤ 1,000
  - 1 ≤ arr의 원소 ≤ 1,000
 */

import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int num = 0, cnt = 0;
        while (num < arr.length) num = (int) Math.pow(2, cnt++);
        int[] answer = new int[num];

        System.arraycopy(arr, 0, answer, 0, arr.length);

        return answer;
    }
}

public class MakeTheLengthOfAnArrayAPowerOf2 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.solution(new int[]{1, 2, 3, 4, 5, 6})));
    }
}

/*
# Another Answer
class Solution {
    public int[] solution(int[] arr) {
        int length = 1;

        while (length < arr.length) {
            length *= 2;
        }

        return Arrays.copyOf(arr, length);
    }
}
 */