import java.io.*;

public class P28701 {
	
	static int N, ans1, ans2, ans3;

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		N = Integer.parseInt(br.readLine());
		br.close();
		
		ans1 = 0;
		ans3 = 0;
		
		
		for(int i=1 ; i<=N ; i++) {
			ans1 += i;
			
			ans3 += i*i*i;
		}
		
		ans2 = ans1*ans1;
		
		
		sb.append(ans1 + "\n" + ans2 + "\n" + ans3);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}	

}
