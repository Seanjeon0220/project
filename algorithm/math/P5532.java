import java.io.*;
 
public class P5532 {
	
	static int L, A, B, C, D, mp, kp, ans;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
    	L = Integer.parseInt(br.readLine());
    	A = Integer.parseInt(br.readLine());
    	B = Integer.parseInt(br.readLine());
    	C = Integer.parseInt(br.readLine());
    	D = Integer.parseInt(br.readLine());
    	br.close();
    	
    	if(A%C == 0) {
    		kp = A/C;
    	}else {
    		kp = A/C + 1;
    	}
    	
    	if(B%D == 0) {
    		mp = B/D;
    	}else {
    		mp = B/D + 1;
    	}
    	
    	if(mp >= kp) {
    		ans = L - mp;
    	}else {
    		ans = L - kp;
    	}
    	
    	sb.append(ans);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
