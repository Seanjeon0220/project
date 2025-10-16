import java.io.*;

public class P6764 {
	
	static int a, b, c, d;
	
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        a = Integer.parseInt(br.readLine());
        b = Integer.parseInt(br.readLine());
        c = Integer.parseInt(br.readLine());
        d = Integer.parseInt(br.readLine());
        br.close();
        
        if(a > b && b > c && c > d) {
        	sb.append("Fish Diving");
        }else if (a < b && b < c && c < d ) {
        	sb.append("Fish Rising");
        }else if (a == b && b == c && c == d) {
        	sb.append("Fish At Constant Depth");
        }else {
        	sb.append("No Fish");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}
