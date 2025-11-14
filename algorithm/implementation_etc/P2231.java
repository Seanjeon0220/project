import java.io.*;

public class P2231 {
	
	static int num, ans;
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        num = Integer.parseInt(br.readLine());
        ans = 0;
        
        for (int i=1 ;i<=num; i++) {
        	int number = i;
        	int temp = 0;
        	
        	while(number>0) {
        		temp += number%10;
        		number/=10;
        	}
        	if(temp + i == num) {
        		ans = i;
        		break;
        	}
        	
        }
        
        sb.append(ans);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}