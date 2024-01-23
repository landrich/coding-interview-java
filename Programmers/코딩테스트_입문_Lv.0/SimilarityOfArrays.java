/*
[배열의 유사도]

* 문제 설명
  - 두 배열이 얼마나 유사한지 확인해보려고 합니다. 문자열 배열 s1과 s2가 주어질 때
    같은 원소의 개수를 return하도록 solution 함수를 완성해주세요.

* 제한사항
  - 1 ≤ s1, s2의 길이 ≤ 100
  - 1 ≤ s1, s2의 원소의 길이 ≤ 10
  - s1과 s2의 원소는 알파벳 소문자로만 이루어져 있습니다
  - s1과 s2는 각각 중복된 원소를 갖지 않습니다.
 */

import java.util.Arrays;
import java.util.HashSet;

class Solution {
    public int solution(String[] s1, String[] s2) {
        HashSet<String> hs1 = new HashSet<>(Arrays.asList(s1));
        HashSet<String> hs2 = new HashSet<>(Arrays.asList(s2));
        hs1.retainAll(hs2);

        return hs1.toArray().length;
    }
}

public class SimilarityOfArrays {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(new String[]{"a", "b", "c"}, new String[]{"com", "b", "d", "p", "c"}));
    }
}

/*
# Another Answer
class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for(String str1 : s1){
            for(String str2 : s2){
                if(str1.equals(str2)){
                    answer++;
                    break;
                }
            }
        }
        return answer;
    }
}
 */