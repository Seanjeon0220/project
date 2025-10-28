import java.io.*;

public class P24860 {
	
	static long vk, jk, vd, jd, vh, dh, jh;

    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	StringBuilder sb = new StringBuilder();
    	
        String[] k = br.readLine().split(" ");
        String[] d = br.readLine().split(" ");
        String[] h = br.readLine().split(" ");
        br.close();
        
        vk = Integer.parseInt(k[0]);
        jk = Integer.parseInt(k[1]);
        vd = Integer.parseInt(d[0]);
        jd = Integer.parseInt(d[1]);
        vh = Integer.parseInt(h[0]);
        dh = Integer.parseInt(h[1]);
        jh = Integer.parseInt(h[2]);
        
        long ans = (vk*jk + vd*jd) * vh * dh * jh;
        
        sb.append(ans);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        
    }
}