import java.io.*;

public class P24263 {
	
	static int a;
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        a = Integer.parseInt(br.readLine());
        
        sb.append(a+"\n"+1);
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
        
    }

}