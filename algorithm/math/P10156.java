import java.io.*;
 
public class P10156 {
	
	static int A, B, C, ans;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        String total[] = br.readLine().split(" ");
        A = Integer.parseInt(total[0]);
        B = Integer.parseInt(total[1]);
        C = Integer.parseInt(total[2]);
        br.close();
        
        ans = A*B - C;
        
        if(ans > 0) {
        	sb.append(ans);
        }else {
        	sb.append(0);
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
