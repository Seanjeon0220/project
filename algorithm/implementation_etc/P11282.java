import java.io.*;

public class P11282 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		N += 44031;
		char ans = (char) N;
		
		System.out.println(ans);
		
		
	}

}