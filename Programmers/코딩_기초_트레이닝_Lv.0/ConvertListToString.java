/*
[문자 리스트를 문자열로 변환하기]

* 문제 설명
  - 문자들이 담겨있는 배열 arr가 주어집니다. arr의 원소들을 순서대로 이어 붙인
    문자열을 return 하는 solution함수를 작성해 주세요.

* 제한사항
  - 1 ≤ arr의 길이 ≤ 200
  - arr의 원소는 전부 알파벳 소문자로 이루어진 길이가 1인 문자열입니다.
 */

class Solution {
    public String solution(String[] arr) {
        String answer = "";

        for (String s : arr) {
            answer += s;
        }

        return answer;
    }
}

public class ConvertListToString {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(new String[]{"a","b","c"}));
    }
}

/*
# Another Answer
class Solution {
    public String solution(String[] arr) {
        return String.join("", arr);
    }
}
 */