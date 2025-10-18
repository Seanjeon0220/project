import java.io.*;
 
public class P10039 {
	
	static int sum, ans;
 
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	StringBuilder sb = new StringBuilder();
    	
    	sum = 0;
    	
    	for(int i=0 ; i<5 ; i++) {
    		int temp = Integer.parseInt(br.readLine());
    		if(temp <= 40) {
    			sum += 40;
    		}else {
    			sum += temp;
    		}
    	}
    	br.close();
    	
    	ans = sum / 5;
    	
    	sb.append(ans);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
