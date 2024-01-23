/*
[자릿수 더하기]

* 문제 설명
  - 정수 n이 매개변수로 주어질 때 n의 각 자리 숫자의 합을 return하도록 solution 함수를 완성해주세요

* 제한사항
  - 0 ≤ n ≤ 1,000,000
 */

class Solution {
    public int solution(int n) {
        int answer = 0;
        String[] strArr = String.valueOf(n).split("");

        for (String s : strArr) {
            answer += Integer.parseInt(s);
        }

        return answer;
    }
}

public class AddDigits {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(930211));
    }
}

/*
# Another Answer
class Solution {
    public int solution(int n) {
        int answer = 0;

        while(n>0){
            answer+=n%10;
            n/=10;
        }

        return answer;
    }
}
 */