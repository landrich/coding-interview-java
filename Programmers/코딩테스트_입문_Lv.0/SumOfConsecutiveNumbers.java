/*
[연속된 수의 합]

* 문제 설명
  - 연속된 세 개의 정수를 더해 12가 되는 경우는 3, 4, 5입니다. 두 정수 num과 total이 주어집니다.
    연속된 수 num개를 더한 값이 total이 될 때, 정수 배열을 오름차순으로 담아 return하도록 solution함수를 완성해보세요.

* 제한사항
  - 1 ≤ num ≤ 100
  - 0 ≤ total ≤ 1000
  - num개의 연속된 수를 더하여 total이 될 수 없는 테스트 케이스는 없습니다.
 */

import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int num, int total) {
        int[] answer;
        int mid = total / num, move = (num - 1) / 2;
        answer = IntStream.rangeClosed(mid - move, mid + move + ((total % num == 0) ? 0 : 1)).toArray();
        System.out.println(-3 / 2);
        return answer;
    }
}

public class SumOfConsecutiveNumbers {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.solution(5, 15)));
    }
}

/*
# Another Answer
class Solution {
    public int[] solution(int num, int total) {
        int[] answer=new int[num];
        int point1= total/num + (1-num)/2;
        for(int i=0; i<num; i++) {
            answer[i] = point1++;
        }
        return answer;
    }
}
 */