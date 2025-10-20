import java.io.*;
 
public class P11943 {
	
	static int A, B, C, D, a1, a2;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        String total1[] = br.readLine().split(" ");
        String total2[] = br.readLine().split(" ");
        br.close();
        
        A = Integer.parseInt(total1[0]);
        B = Integer.parseInt(total1[1]);
        C = Integer.parseInt(total2[0]);
        D = Integer.parseInt(total2[1]);
        
        a1 = A+D;
        a2 = B+C;
        
        if(a1>a2) {
        	sb.append(a2);
        }else {
        	sb.append(a1);
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
