import java.io.*;

public class P25640 {
	
	static int N, ans;
	static String jh;
	
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        jh = br.readLine();
        N = Integer.parseInt(br.readLine());
        ans = 0;
        for(int i=0 ; i<N ; i++) {
        	String temp = br.readLine();
        	if(temp.equals(jh)) {
        		ans++;
        	}
        }
        br.close();
        
        sb.append(ans);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}