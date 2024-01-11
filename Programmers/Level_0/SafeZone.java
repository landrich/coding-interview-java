/*
[안전지대]

* 문제 설명
  - 다음 그림과 같이 지뢰가 있는 지역과 지뢰에 인접한 위, 아래, 좌, 우 대각선 칸을 모두 위험지역으로 분류합니다.
    [0, 0, 0, 0, 0]
    [0, X, X, X, 0]
    [0, X, 1, X, 0]
    [0, X, X, X, 0]
    [0, 0, 0, 0, 0]
    지뢰는 2차원 배열 board에 1로 표시되어 있고 board에는 지뢰가 매설 된 지역 1과,
    지뢰가 없는 지역 0만 존재합니다. 지뢰가 매설된 지역의 지도 board가 매개변수로 주어질 때,
    안전한 지역의 칸 수를 return하도록 solution 함수를 완성해주세요.

* 제한사항
  - board는 n * n 배열입니다.
  - 1 ≤ n ≤ 100
  - 지뢰는 1로 표시되어 있습니다.
  - board에는 지뢰가 있는 지역 1과 지뢰가 없는 지역 0만 존재합니다.
 */

class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int rows = board.length;
        int cols = board[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == 1) {
                    if (i - 1 >= 0 && j - 1 >= 0) board[i - 1][j - 1] = board[i - 1][j - 1] == 1 ? 1 : 2;
                    if (i - 1 >= 0) board[i - 1][j] = board[i - 1][j] == 1 ? 1 : 2;
                    if (i - 1 >= 0 && j + 1 < cols) board[i - 1][j + 1] = 2;

                    if (j - 1 >= 0) board[i][j - 1] = board[i][j - 1] == 1 ? 1 : 2;
                    if (j + 1 < cols) board[i][j + 1] = board[i][j + 1] == 1 ? 1 : 2;

                    if (i + 1 < cols && j - 1 >= 0) board[i + 1][j - 1] = board[i + 1][j - 1] == 1 ? 1 : 2;
                    if (i + 1 < cols) board[i + 1][j] = board[i + 1][j] == 1 ? 1 : 2;
                    if (i + 1 < cols && j + 1 < cols) board[i + 1][j + 1] = board[i + 1][j + 1] == 1 ? 1 : 2;
                }
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == 0) answer++;
            }
        }

        return answer;
    }
}

public class SafeZone {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(new int[][]{{1, 1, 1, 1, 1, 1}, {0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}, {1, 0, 0, 0, 0, 1}}));
    }
}

/*
# Another Answer
 */