import java.io.*;

public class P1018 {
	
	static int N, M;
	
    public static int getMinCost(int startrow, int startcol, String[] chessboard) {
        String[] board = {"WBWBWBWB", "BWBWBWBW"}; 

        int whiteVerCount = 0;

        for(int i = 0; i < 8; i++){
            int row = startrow + i;
            for(int j = 0; j < 8; j++){
                int col = startcol + j;

                if(chessboard[row].charAt(col) != board[row%2].charAt(j)){
                    whiteVerCount++;
                }
            }
        }
        
        return Math.min(whiteVerCount, 64-whiteVerCount);

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String total[] = br.readLine().split(" ");
        N = Integer.parseInt(total[0]);
        M = Integer.parseInt(total[1]);

        String[] chessboard = new String[N];

        for(int i = 0; i < N; i++){
            chessboard[i] = br.readLine();
        }

        
        int count = Integer.MAX_VALUE; 
        for(int i = 0; i <= N-8; i++){
            for(int j = 0; j <= M-8; j++){
                int resultCount = getMinCost(i, j, chessboard);

                if(count > resultCount){
                    count = resultCount;
                }
            }
        }
        
        sb.append(count);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }
}