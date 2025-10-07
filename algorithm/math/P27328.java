import java.io.*;

public class P27328 {
	
	static int A, B;
	
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
    	
        A = Integer.parseInt(br.readLine());
        B = Integer.parseInt(br.readLine());
        br.close();
        
        if(A>B) {
        	sb.append(1);
        }else if(A<B) {
        	sb.append(-1);
        }else {
        	sb.append(0);
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}