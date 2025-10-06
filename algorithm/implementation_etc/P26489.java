import java.io.*;

public class P26489{
	
	static int ans;
	
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
    	
        ans = 0;
        while(true) {
        	String temp = br.readLine();
        	if(temp == null) {
        		break;
        	}else {
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