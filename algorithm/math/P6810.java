import java.io.*;

public class P6810 {
	
	static int A, B, C, ans;
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        A = Integer.parseInt(br.readLine());
        B = Integer.parseInt(br.readLine());
        C = Integer.parseInt(br.readLine());
        br.close();

        ans = 91 + A+C + 3*B;

        sb.append("The 1-3-sum is " + ans);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
