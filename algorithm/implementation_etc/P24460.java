import java.io.*;
import java.util.*;

public class P24460 {
	public static int split(int x, int y, int n, int[][] total) {
        if (n == 1) {
            return total[x][y];
        } else {
            int[] list = {
                split(x, y, n / 2, total),
                split(x, y + (n / 2), n / 2, total),
                split(x + (n / 2), y, n / 2, total),
                split(x + (n / 2), y + (n / 2), n / 2, total)
            };
            Arrays.sort(list);
            return list[1];
        }
    }

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb=new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[][] total = new int[N][N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                total[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        int result = split(0,0,N,total);
        
        sb.append(result);
        
        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}