import java.io.*;

public class P9663 {

    static int N;
    static int resultCount;
    static int[] board;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        board = new int[N];

        backTracking(0);
        br.close();
        System.out.println(resultCount);
    }

    static void backTracking(int queenCount) {
        if (queenCount == N) {
            resultCount++;
            return;
        }

        for(int i = 0; i < N; i++) {
            board[queenCount] = i;
            if (checkQueen(queenCount)) {
                backTracking(queenCount + 1);
            }
        }

    }

    static boolean checkQueen(int col){
        for (int i = 0; i < col; i++) {
            if (board[col] == board[i]) {
                return false;
            }

            else if (Math.abs(col - i) == Math.abs(board[col] - board[i])) {
                return false;
            }
        }
        return true;
    }
}