import java.io.*;

public class P26500 {
	
	static int N;

    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	StringBuilder sb = new StringBuilder();
    	
    	N = Integer.parseInt(br.readLine());
    	for(int i=0 ; i<N ; i++) {
    		String[] temp = br.readLine().split(" ");
    		double a = Double.parseDouble(temp[0]);
    		double b = Double.parseDouble(temp[1]);
    		
    		String ans = String.format("%.1f", Math.abs(a-b));
    		
    		sb.append(ans+"\n");
    	}
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
        
    }
}