import java.io.*;

public class P31654 {
	
	static int A, B, C;
	
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
    	
        String total[] = br.readLine().split(" ");
        br.close();
        A = Integer.parseInt(total[0]);
        B = Integer.parseInt(total[1]);
        C = Integer.parseInt(total[2]);
        
        if(A+B == C) {
        	sb.append("correct!");
        }else{
        	sb.append("wrong!");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}