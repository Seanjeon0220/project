import java.io.*;
 
public class P5554 {
	
	static int sum, m, s;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        
    	for(int i=0 ; i<4 ; i++) {
    		int temp = Integer.parseInt(br.readLine());
    		sum += temp;
    	}
    	br.close();
    	
    	m = sum/60;
    	s = sum%60;
    	
    	sb.append(m +"\n"+s);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
