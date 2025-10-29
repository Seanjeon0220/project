import java.io.*;

public class P26068{
		
	static int N, ans = 0;
	
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	StringBuilder sb = new StringBuilder();
    	
    	N = Integer.parseInt(br.readLine());
    	
    	for(int i=0 ; i<N ; i++) {
    		String temp = br.readLine();
    		int n = Integer.parseInt(temp.substring(2, temp.length()));
    		if(n <= 90) {
    			ans ++;
    		}
    	}
        br.close();
        
        sb.append(ans);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}


