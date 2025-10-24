import java.io.*;

public class P18198 {
	
	static String total;
	static int a = 0, b = 0;

    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	StringBuilder sb = new StringBuilder();
    	
        total = br.readLine();
        br.close();
        
        int n = total.length();
        for(int i=0 ; i<n ; i+=2) {
        	if(total.substring(i, i+1).equals("A")){
        		a += Integer.parseInt(total.substring(i+1, i+2));
        	}else{
        		b += Integer.parseInt(total.substring(i+1, i+2));
        	}
        }
        
        if(a>b) {
        	sb.append("A");
        }else {
        	sb.append("B");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        
    }
}