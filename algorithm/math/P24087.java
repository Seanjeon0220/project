import java.io.*;

public class P24087 {
		
	static int S, A, B, ans = 250;;
	
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	StringBuilder sb = new StringBuilder();
    	
    	S = Integer.parseInt(br.readLine());
    	A = Integer.parseInt(br.readLine());
    	B = Integer.parseInt(br.readLine());
        br.close();
        
        if(A>S) {
        	sb.append(ans);
        }else {
        	int temp = S-A;
        	if(temp % B == 0) {
        		ans += temp/B * 100;
        		sb.append(ans);
        	}else {
        		ans += (temp/B + 1)*100;
        		sb.append(ans);
        	}
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}

