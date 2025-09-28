import java.io.*;
 
public class P5717 {
 
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	StringBuilder sb = new StringBuilder();
    	
    	while(true) {
    		String total[] = br.readLine().split(" ");
    		if(total[0].equals("0")) {
    			break;
    		}else {
    			int M = Integer.parseInt(total[0]);
    			int F = Integer.parseInt(total[1]);
    			sb.append(M+F + "\n");
    		}
    	}
    	
    	br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
