import java.io.*;

public class P2908 {
    
	static int N, M;
	
	public static int reverse(int x) {
		
		int rev = 0;		
			
		while(x!=0) {
			rev = rev*10 + x%10;
			x/=10;
		}	
		return rev;
	}
		
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        String[] arr = br.readLine().split(" ");
        
        N = reverse(Integer.parseInt(arr[0]));
        M = reverse(Integer.parseInt(arr[1]));
        
        if (N>M) {
        	sb.append(N);
        }else {
        	sb.append(M);
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }
}