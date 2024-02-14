/*
[문자열 바꿔서 찾기]

* 문제 설명
  - 문자 "A"와 "B"로 이루어진 문자열 myString과 pat가 주어집니다. myString의 "A"를 "B"로, "B"를 "A"로 바꾼
    문자열의 연속하는 부분 문자열 중 pat이 있으면 1을 아니면 0을 return 하는 solution 함수를 완성하세요.

* 제한사항
  - 1 ≤ myString의 길이 ≤ 100
  - 1 ≤ pat의 길이 ≤ 10
  - myString과 pat는 문자 "A"와 "B"로만 이루어진 문자열입니다.
 */

class Solution {
    public int solution(String myString, String pat) {
        String temp = "";

        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) == 'A') temp += "B";
            else temp += "A";
        }

        return temp.contains(pat) ? 1 : 0;
    }
}

public class FindByChangingString {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution("ABBAA", "AABB"));
    }
}

/*
# Another Answer
 */