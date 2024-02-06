/*
[글자 지우기]

* 문제 설명
  - 정수 n과 k가 주어졌을 때, 1 이상 n이하의 정수 중에서 k의 배수를 오름차순으로
    저장한 배열을 return 하는 solution 함수를 완성해 주세요.

* 제한사항
  - 1 ≤ n ≤ 1,000,000
  - 1 ≤ k ≤ min(1,000, n)
 */

class Solution {
    public String solution(String my_string, int[] indices) {
        String[] strArr = my_string.split("");

        for (int i : indices) {
            strArr[i] = "";
        }

        return String.join("", strArr);
    }
}

public class EraseLetters {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution("apporoograpemmemprs", new int[]{1, 16, 6, 15, 0, 10, 11, 3}));
    }
}

/*
# Another Answer
 */