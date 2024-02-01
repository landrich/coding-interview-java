/*
[주사위 게임 3]

* 문제 설명
  - 1부터 6까지 숫자가 적힌 주사위가 네 개 있습니다. 네 주사위를 굴렸을 때 나온 숫자에 따라 다음과 같은 점수를 얻습니다.
      * 네 주사위에서 나온 숫자가 모두 p로 같다면 1111 × p점을 얻습니다.
      * 세 주사위에서 나온 숫자가 p로 같고 나머지 다른 주사위에서 나온 숫자가 q(p ≠ q)라면 (10 × p + q)^2 점을 얻습니다.
      * 주사위가 두 개씩 같은 값이 나오고, 나온 숫자를 각각 p, q(p ≠ q)라고 한다면 (p + q) × |p - q|점을 얻습니다.
      * 어느 두 주사위에서 나온 숫자가 p로 같고 나머지 두 주사위에서 나온 숫자가 각각 p와 다른 q, r(q ≠ r)이라면 q × r점을 얻습니다.
      * 네 주사위에 적힌 숫자가 모두 다르다면 나온 숫자 중 가장 작은 숫자 만큼의 점수를 얻습니다.
    네 주사위를 굴렸을 때 나온 숫자가 정수 매개변수 a, b, c, d로 주어질 때, 얻는 점수를 return 하는 solution 함수를 작성해 주세요.

* 제한사항
  - a, b, c, d는 1 이상 6 이하의 정수입니다.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 1, findCnt1 = 0, findCnt3 = 0;
        ArrayList<Integer> findCnt2List = new ArrayList<>();
        int[] numArr = new int[]{a, b, c, d};
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : numArr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        if (map.size() == 1) answer = 1111 * a;
        else if (map.size() == 4) answer = Math.min(Math.min(a, b), Math.min(c, d));
        else if (map.size() == 3) {
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() == 1) answer *= entry.getKey();
            }
        } else {
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() == 1) findCnt1 = entry.getKey();
                else if (entry.getValue() == 3) findCnt3 = entry.getKey();
                else findCnt2List.add(entry.getKey());
            }
            if (findCnt2List.isEmpty()) {
                answer = (int) Math.pow(10 * findCnt3 + findCnt1, 2);
            } else {
                answer = (findCnt2List.get(0) + findCnt2List.get(1)) * Math.abs(findCnt2List.get(0) - findCnt2List.get(1));
            }
        }

        return answer;
    }
}

public class DiceGame3 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(6, 3, 3, 6));
    }
}

/*
# Another Answer
import java.util.Arrays;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] dice = { a, b, c, d };   
        Arrays.sort(dice);
        int ans = 0;

        if (dice[0] == dice[3]) {
            ans = 1111 * dice[3];
        } else if (dice[0] == dice[2] || dice[1] == dice[3]) {
            ans = (int) Math.pow(dice[1] * 10 + (dice[0] + dice[3] - dice[1]), 2);
        } else if (dice[0] == dice[1] && dice[2] == dice[3]) {
            ans = (dice[0] + dice[3]) * (dice[3] - dice[0]);
        } else if (dice[0] == dice[1]) {
            ans = dice[2] * dice[3];
        } else if (dice[1] == dice[2]) {
            ans = dice[0] * dice[3];
        } else if (dice[2] == dice[3]) {
            ans = dice[0] * dice[1];
        } else {
            ans = dice[0];
        }

        return ans;
    }
}
 */