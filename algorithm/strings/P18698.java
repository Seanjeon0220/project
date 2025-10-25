import java.io.*;

public class P18698 {
	
	static String total;
	static int N;

    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	StringBuilder sb = new StringBuilder();
    	
    	N = Integer.parseInt(br.readLine());
    	for(int i=0 ; i<N ; i++) {
    		total = br.readLine();
    		if(total.indexOf("D") == -1) {
    			sb.append(total.length()+"\n");
    		}else {
    			int j = 0;
    			int cnt = 0;
    			while(true){
                	String temp = total.substring(j,j+1);
                	if(temp.equals("D")) {
                		sb.append(cnt+"\n");
                		break;
                	}else {
                		cnt++;
                		j++;
                	}
                }
    		}
    	}
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
        
    }
}