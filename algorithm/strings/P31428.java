import java.io.*;
import java.util.*;

public class P31428 {
	
	static int N, ans;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		N = Integer.parseInt(br.readLine());
		String total[] = new String[N];
		StringTokenizer st = new StringTokenizer(br.readLine());;
		for(int i=0 ; i<N ; i++) {
			total[i] = st.nextToken();
		}
		String check = br.readLine();
		br.close();
		
		ans = 0;
		for(int i=0 ; i<N ; i++) {
			if(total[i].equals(check)) {
				ans++;
			}
		}
		
		sb.append(ans);
		bw.write(sb.toString());
		bw.flush();
		bw.close(); 
	}
}