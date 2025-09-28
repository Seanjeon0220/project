import java.io.*;

public class P5341 {
	
	public static int py(int n) {
		int ans = 0;
		for(int i=1 ; i<=n ; i++) {
			ans+=i;
		}
		return ans;
	}
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        while(true) {
        	int temp = Integer.parseInt(br.readLine());
        	if(temp == 0) {
        		break;
        	}else {
        		
        	}sb.append(py(temp)+"\n");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}