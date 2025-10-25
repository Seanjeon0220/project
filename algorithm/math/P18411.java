import java.io.*;
import java.util.*;

public class P18411 {

	static int score[] = new int[3], ans;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i=0 ; i<3 ; i++) {
			int temp = Integer.parseInt(st.nextToken());
			score[i] = temp;
		}
		br.close();
		
		Arrays.sort(score);
		
		ans = score[1] + score[2];
		
		sb.append(ans);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}

}