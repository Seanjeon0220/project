import java.io.*;

public class P16430 {
	
	static int A, B, up, down;
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        String total[] = br.readLine().split(" ");
        A = Integer.parseInt(total[0]);
        B = Integer.parseInt(total[1]);
        
        up = B - A;
        down = B;
        
        sb.append(up+" "+down);
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}