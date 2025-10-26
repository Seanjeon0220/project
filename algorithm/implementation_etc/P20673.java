import java.io.*;

public class P20673 {
	
	static int a, b;

    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	StringBuilder sb = new StringBuilder();
    	
    	a = Integer.parseInt(br.readLine());
    	b = Integer.parseInt(br.readLine());
        
    	if(a <= 50 && b<= 10) {
    		sb.append("White");
    	}else if(b > 30) {
    		sb.append("Red");
    	}else {
    		sb.append("Yellow");
    	}
    	
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
        
    }
}