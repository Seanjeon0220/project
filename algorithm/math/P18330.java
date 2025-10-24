import java.io.*;

public class P18330 {
	
	static int a, b;

    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	StringBuilder sb = new StringBuilder();
    	
    	a = Integer.parseInt(br.readLine());
    	b = Integer.parseInt(br.readLine());
        
    	int h = b+60;
    	
    	if(a > h) {
    		sb.append(1500*(h) + 3000*(a-h));
    	}else {
    		sb.append(1500*a);
    	}
    	
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
        
    }
}