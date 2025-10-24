import java.io.*;

public class P17863 {
	
	static String num;
	
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
    	StringBuilder sb = new StringBuilder();
    	
    	num = br.readLine();
        br.close();
        
        if(num.charAt(0) == '5' && num.charAt(1) == '5' && num.charAt(2) == '5') {
        	sb.append("YES");
        }else {
        	sb.append("NO");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}

