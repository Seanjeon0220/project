import java.io.*;

public class P25591 {
		
	static int A, B, a, b, c, d, q, r;
	
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	StringBuilder sb = new StringBuilder();
    	
    	String total[] = br.readLine().split(" ");
        br.close();
        A = Integer.parseInt(total[0]);
        B = Integer.parseInt(total[1]);
        
        a = 100 - A;
        b = 100 - B;
        c = 100 - (a+b);
        d = a * b;
        q = d / 100;
        r = d % 100;
        
        sb.append(a +" ");
        sb.append(b +" ");
        sb.append(c +" ");
        sb.append(d +" ");
        sb.append(q +" ");
        sb.append(r +"\n");
        sb.append(c+q+" ");
        sb.append(r);
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}

