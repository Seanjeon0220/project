import java.io.*;
 
public class P10797 {
	
	static int A, ans;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        ans = 0;
        A = Integer.parseInt(br.readLine());
        String total[] = br.readLine().split(" ");
        br.close();
        
        for(int i=0 ; i<5 ; i++) {
        	if(Integer.parseInt(total[i]) == A) {
        		ans ++;
        	}
        }
        
        sb.append(ans);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
