/*
[ad 제거하기]

* 문제 설명
  - 문자열 배열 strArr가 주어집니다. 배열 내의 문자열 중 "ad"라는 부분 문자열을 포함하고 있는 모든 문자열을 제거하고
    남은 문자열을 순서를 유지하여 배열로 return 하는 solution 함수를 완성해 주세요.

* 제한사항
  - 1 ≤ strArr의 길이 ≤ 1,000
  - 1 ≤ strArr의 원소의 길이 ≤ 20
  - strArr의 원소는 알파벳 소문자로 이루어진 문자열입니다.
 */

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public String[] solution(String[] strArr) {
        ArrayList<String> answer = new ArrayList<>();

        for (String str : strArr) {
            if (!str.contains("ad")) {
                answer.add(str);
            }
        }

        return answer.toArray(new String[0]);
    }
}

public class RemoveAd {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.solution(new String[]{"and", "notad", "abcd"})));
    }
}

/*
# Another Answer
 */