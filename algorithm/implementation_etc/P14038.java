import java.io.*;

public class P14038 {
	
	static int cnt = 0;

    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	StringBuilder sb = new StringBuilder();
    	
        for(int i=0 ; i<6 ; i++) {
        	String temp = br.readLine();
        	if(temp.equals("W")) {
        		cnt++;
        	}
        }
        br.close();
        
        if(cnt > 4) {
        	sb.append(1);
        }else if(cnt > 2) {
        	sb.append(2);
        }else if(cnt > 0) {
        	sb.append(3);
        }else {
        	sb.append(-1);
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        
    }
}