import java.io.*;

public class P31616 {
		
	static int N;
	static String S;
	static boolean check = true;
	
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	StringBuilder sb = new StringBuilder();
    	
    	N = Integer.parseInt(br.readLine());
    	S = br.readLine();
        br.close();
        
        char f = S.charAt(0);
        
        for(int i=1 ; i<N ; i++) {
        	char s = S.charAt(i);
        	if(f == s){
        		continue;
        	}else {
        		check = false;
        		break;
        	}
        }
        
        if(check) {
        	sb.append("Yes");
        }else {
        	sb.append("No");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}

