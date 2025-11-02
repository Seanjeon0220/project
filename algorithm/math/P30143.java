import java.io.*;

public class P30143 {
	
	static int T, a, b, c;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		T = Integer.parseInt(br.readLine());
		
		for (int i=0 ; i<T; i++) {
			String[] temp = br.readLine().split(" ");
			a = Integer.parseInt(temp[0]);
			b = Integer.parseInt(temp[1]);
			c = Integer.parseInt(temp[2]);
			
			sb.append(a*b + ((a*(a-1)/2))*c + "\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}	
