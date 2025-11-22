import java.io.*;

public class P2839 {
	
	static int N, num, cnt, ans;
	
	public static int check(int n) {
		int temp = 0;
		int check = n/5;
		
		for (int i=check ; i>=0 ; i--) {
			int temp2 = n-i*5;
			if (temp2 %3 == 0) {
				temp  = temp + i + temp2/3;
				break;
			}
		}
		
		if(temp == 0) {
			return -1;
		}
		
		return temp;
	}
   
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        N = Integer.parseInt(br.readLine());
        
        ans =  check(N);
        
        sb.append(ans);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }
}