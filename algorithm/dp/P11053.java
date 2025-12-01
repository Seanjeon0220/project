import java.io.*;
import java.util.*;
 
public class P11053 {
	
	static int N;
 
    public static void main(String[] args) throws NumberFormatException, IOException {
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder sb = new StringBuilder();
    	StringTokenizer st;

    	int N = Integer.parseInt(br.readLine());
    	int[] arr = new int[N];
    	int[] dp = new int[N];

    	st = new StringTokenizer(br.readLine());
    	for (int i = 0; i < N; i++) {
    		arr[i] = Integer.parseInt(st.nextToken());
    	}

    	for (int i = 0; i < N; i++) {
    	    dp[i] = 1;
    	    for (int j = 0; j < i; j++) {
    	        if (arr[j] < arr[i] && dp[j] + 1 > dp[i]) {
    	            dp[i] = dp[j] + 1;
    			}
    		}
    	}

    	int max = 0;
    	for (int l : dp) {
    		if (max < l) {
    	    	max = l;
    		}
    	}

    	sb.append(max);
    	bw.write(sb.toString());
    	bw.flush();
    	bw.close();
    	br.close();
    }
}