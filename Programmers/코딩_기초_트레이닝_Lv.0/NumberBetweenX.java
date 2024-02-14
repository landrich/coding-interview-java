/*
[x 사이의 개수]

* 문제 설명
  - 문자열 myString이 주어집니다. myString을 문자 "x"를 기준으로 나눴을 때 나눠진 문자열
    각각의 길이를 순서대로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.

* 제한사항
  - 1 ≤ myString의 길이 ≤ 100,000
  - myString은 알파벳 소문자로 이루어진 문자열입니다.
 */

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(String myString) {
        ArrayList<Integer> answer = new ArrayList<>();
        String[] strSplit = myString.split("x", -1);

        for (String str : strSplit) {
            answer.add(str.length());
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }
}

public class NumberBetweenX {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.solution("oxooxoxxox")));
    }
}

/*
# Another Answer
 */