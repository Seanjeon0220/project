import java.io.*;

public class P2558 {
	
	static int A, B, ans;
	
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();

    A = Integer.parseInt(br.readLine());
    B = Integer.parseInt(br.readLine());
    
    ans = A+B;
    
    sb.append(ans);
    bw.write(sb.toString());
    br.close();
    bw.flush();
    bw.close();
  }
}