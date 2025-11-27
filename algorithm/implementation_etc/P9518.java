import java.io.*;
import java.util.*;

public class P9518 {
	
	static int R, S;
	static char[][] total;
	static int[] da = {-1, 0, 1, 1, 1, 0, -1, -1};
	static int[] db = {1, 1, 1, 0, -1, -1, -1, 0};
	
	static boolean intherange(int a, int b) {
		if (a<0 || a>=R || b<0 || b>=S) {
			return false;
		}else {
			return true;
		}
		
	}
	
	static int checkAround(int a, int b, int limit) {
		int sum = 0;
		
		int na, nb;
		for (int k=0; k<limit; k++) {
			na = a + da[k];
			nb = b + db[k];
			
			if (!intherange(na, nb))
				continue;
			
			if (total[na][nb] == 'o')
				sum++;
		}
		return sum;
	}
	
	
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb=new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        R = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());
        total = new char[R][S];

        for (int i = 0; i < R; i++) {
                total[i] = br.readLine().toCharArray();
                }
        
        int initial = 0;
        
        for (int i=0 ; i<R ; i++) {
        	for (int j=0 ; j<S ; j++) {
        		if (total[i][j]=='.') {
        			continue;
        		}else {
        			initial += checkAround(i,j,4); 
        		}
        	}
        }
        
        int result = initial;
        
        for (int i=0; i<R; i++) {
			for (int j=0; j<S; j++) {
				if (total[i][j] == '.') {
					int sum = checkAround(i, j, 8);
					
					result = Math.max(result, initial+sum);
				}
			}
		}
		sb.append(result);
    

        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}