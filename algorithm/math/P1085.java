import java.io.*;

public class P1085 {
	
	static int x, y, w, h, up, down, left, right, t1, t2, ans;
	
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        String[] total = br.readLine().split(" ");
        
        x = Integer.parseInt(total[0]);
        y = Integer.parseInt(total[1]);
        w = Integer.parseInt(total[2]);
        h = Integer.parseInt(total[3]);
        
        up = h - y;
        down = y;
        left = w - x;
        right = x;
        
        t1 = Math.min(up,  down);
        t2 = Math.min(left,  right);
        
        ans = Math.min(t1,  t2);
        
        sb.append(ans);
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
        
    }

}