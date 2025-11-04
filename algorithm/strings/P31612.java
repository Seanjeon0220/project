import java.io.*;

public class P31612{
		
	static int N, sum = 0;
	static String S;
	
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	StringBuilder sb = new StringBuilder();
    	
    	N = Integer.parseInt(br.readLine());
    	S = br.readLine();
        br.close();
        
        for(int i=0 ; i<N ; i++) {
        	char t = S.charAt(i);
        	if(t == 'o') {
        		sum += 1;
        	}else {
        		sum += 2;
        	}
        }
        
        sb.append(sum);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}

