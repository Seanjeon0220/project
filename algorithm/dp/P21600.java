import java.io.*;
import java.util.StringTokenizer;

public class P21600 {
	
	static int N, histogram[];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st; 
        StringBuilder sb=new StringBuilder();
        
        N = Integer.parseInt(br.readLine());
        histogram = new int[N];
        st = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < N; i++) {
            histogram[i] = Integer.parseInt(st.nextToken());
        }
        
        int stairlength = 0;
        int result = 0;
        for (int x : histogram) {
            stairlength = stairlength + 1 <= x ? stairlength + 1 : x;
            result = Math.max(result, stairlength);
        }
        
        sb.append(result);
		bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();
 }
}