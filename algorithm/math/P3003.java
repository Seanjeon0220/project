import java.io.*;

public class P3003 {
	
	static String[] total;
	static int k, q, l, b, n, p;
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        total = br.readLine().split(" ");
        
        k = Integer.parseInt(total[0]);
        q = Integer.parseInt(total[1]);
        l = Integer.parseInt(total[2]);
        b = Integer.parseInt(total[3]);
        n = Integer.parseInt(total[4]);
        p = Integer.parseInt(total[5]);
        
        sb.append(1-k +" ");
        sb.append(1-q +" ");
        sb.append(2-l +" ");
        sb.append(2-b +" ");
        sb.append(2-n +" ");
        sb.append(8-p);
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }
}