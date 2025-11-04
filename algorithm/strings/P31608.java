import java.io.*;

public class P31608 {
		
	static int N, ans = 0;
	static String S, T;
	
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	StringBuilder sb = new StringBuilder();
    	
    	N = Integer.parseInt(br.readLine());
    	S = br.readLine();
    	T = br.readLine();
        br.close();
        
        for(int i=0 ; i<N ; i++) {
        	char s = S.charAt(i);
        	char t = T.charAt(i);
        	if(s == t){
        		continue;
        	}else {
        		ans ++;
        	}
        }
        
        sb.append(ans);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}

