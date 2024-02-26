/*
[PCCE_06_ProvisionalMarks]
 */

import java.util.Arrays;

class Solution {
    public String[] solution(int[] numbers, int[] our_score, int[] score_list) {
        int num_student = numbers.length;
        String[] answer = new String[num_student];

        for (int i = 0; i < num_student; i++) {
            if (our_score[i] == score_list[numbers[i] - 1]) {
                answer[i] = "Same";
            }
            else {
                answer[i] = "Different";
            }
        }

        return answer;
    }
}

public class PCCE_06_ProvisionalMarks {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.solution(new int[]{3, 4}, new int[]{85, 93}, new int[]{85, 92, 38, 93})));
    }
}