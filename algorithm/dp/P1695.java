import java.io.*;
import java.util.*;

public class P1695{
    public static int N;
    public static int[][] dp;
    public static int[] arr;
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st; 
        
        N = Integer.parseInt(br.readLine());
        dp = new int[N+1][N+1];
        arr = new int[N];
        
        for(int i=0;i<=N;i++){
            Arrays.fill(dp[i],-1);
        }
        
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int res = dp(0,N-1);
        sb.append(res);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    public static int dp(int left, int right){
        if(left>=right) {
            return 0;
        }
        if(dp[left][right]!=-1) {
            return dp[left][right];
        }
            
        int min =0;
        if(arr[left]==arr[right]) {
            min =dp(left+1,right-1);
        }
            
        else {
            min = Math.min(dp(left+1,right)+1 ,dp(left,right-1)+1);
        }
                 
        return dp[left][right]=min;
    }
}
