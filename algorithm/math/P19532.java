import java.io.*;

public class P19532 {
	
	static int a, b, c, d, e, f, ansX, ansY;
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        String[] total = br.readLine().split(" ");
        a= Integer.parseInt(total[0]);
        b= Integer.parseInt(total[1]);
        c= Integer.parseInt(total[2]);
        d= Integer.parseInt(total[3]);
        e= Integer.parseInt(total[4]);
        f= Integer.parseInt(total[5]);
        
        for (int x =-999 ; x<1000 ; x++) {
        	for (int y= -999 ; y<1000 ; y++) {
        		if (a*x + b*y ==c && d*x+e*y == f) {
        			ansX = x;
        			ansY = y;
        		}
        	}
        }
        
        sb.append(ansX+" "+ansY);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}