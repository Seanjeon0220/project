import java.io.*;

public class P6888 {
	
	static int s, e;
	
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        
        s = Integer.parseInt(br.readLine());
        e = Integer.parseInt(br.readLine());
        br.close();
        
        for(int i=s ; i<=e ; i+=60) {
        	sb.append("All positions change in year " + i + "\n");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}