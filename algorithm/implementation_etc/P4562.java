import java.io.*;
 
public class P4562 {
	
	static int N;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        N = Integer.parseInt(br.readLine());
        for(int i=0 ; i<N ; i++) {
        	String total[] = br.readLine().split(" ");
        	int X = Integer.parseInt(total[0]);
        	int Y = Integer.parseInt(total[1]);
        	if(X>=Y) {
        		sb.append("MMM BRAINS"+"\n");
        	}else {
        		sb.append("NO BRAINS"+"\n");
        	}
        }
        br.close();
    	
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
