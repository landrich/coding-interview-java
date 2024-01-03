/*
[한 번만 등장한 문자]

* 문제 설명
  - 문자열 s가 매개변수로 주어집니다. s에서 한 번만 등장하는 문자를 사전 순으로 정렬한 문자열을
    return 하도록 solution 함수를 완성해보세요. 한 번만 등장하는 문자가 없을 경우 빈 문자열을 return 합니다.

* 제한사항
  - 0 < s의 길이 < 1,000
  - s는 소문자로만 이루어져 있습니다.
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String s) {
        String str = "";
        String[] answer;
        Map<Character, Integer> hash = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            hash.put(s.charAt(i), hash.getOrDefault(s.charAt(i) ,0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : hash.entrySet()) {
            if (entry.getValue().equals(1)) str += entry.getKey();
        }
        answer = str.split("");
        Arrays.sort(answer);

        return String.join("", answer);
    }
}

public class CharactersAppearOnlyOnce
        {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution("abdc"));
    }
}

/*
# Another Answer
 */