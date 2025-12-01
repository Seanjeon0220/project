import java.io.*;
import java.util.*;

public class P2210{
	
	static int[][] total = new int[5][5];
	static boolean[] check = new boolean[1000000];
	static int[] dx =new int[] {0,0,-1,1};
	static int[] dy =new int[] {-1,1,0,0};
	
	static void dfs(int x, int y, int num, int depth) {
		if (depth==6) {
			check[num] = true;
			return;
		}
		for (int i=0 ; i<4 ; i++) {
			int nx = x+dx[i];
			int ny = y+dy[i];
			if (nx<0 || nx>=5 ||ny<0 || ny>=5) {
				continue;
			}
			dfs(nx,ny,num*10+total[nx][ny],depth+1);
		}
	}
			
		
	public static void main(String[] args) throws IOException{
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb=new StringBuilder();

        for (int i=0 ; i<5 ; i++) {
        	st = new StringTokenizer(br.readLine());
        	for (int j=0 ; j<5; j++) {
        		total[i][j] = Integer.parseInt(st.nextToken());
        	}
        }
        for (int i=0 ; i<5 ; i++) {
        	for (int j=0 ; j<5 ; j++) {
        		dfs(i,j,total[i][j], 1);
        	}
        }
        
        int ans = 0;
        for (int i=0 ; i<1000000 ; i++) {
        	if (check[i]) {
        		ans++;
        	}
        }
        
        sb.append(ans);
        
        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}