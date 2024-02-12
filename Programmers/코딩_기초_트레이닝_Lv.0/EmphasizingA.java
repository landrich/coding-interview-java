/*
[A 강조하기]

* 문제 설명
  - 문자열 myString이 주어집니다. myString에서 알파벳 "a"가 등장하면 전부 "A"로 변환하고, "A"가 아닌 모든
    대문자 알파벳은 소문자 알파벳으로 변환하여 return 하는 solution 함수를 완성하세요.

* 제한사항
  - 1 ≤ myString의 길이 ≤ 20
  - myString은 알파벳으로 이루어진 문자열입니다.
 */

class Solution {
    public String solution(String myString) {
        String answer = "";
        String[] strArr = myString.split("");

        for (String str : strArr) {
            if (str.equals("a") || str.equals("A")) {
                answer += str.toUpperCase();
            } else {
                answer += str.toLowerCase();
            }
        }

        return answer;
    }
}

public class EmphasizingA {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution("abstract algebra"));
    }
}

/*
# Another Answer
 */