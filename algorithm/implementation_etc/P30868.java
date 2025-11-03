import java.io.*;

public class P30868 {
	
	static int N;
	
	public static String check(int temp) {
		int a = temp/5;
		int b = temp%5;
		String ans = "";
		
		for(int x=0 ; x<a ; x++) {
			ans += "++++ ";
		}
		
		for(int y=0 ; y<b ; y++) {
			ans += "|";
		}
		
		return ans;
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		N = Integer.parseInt(br.readLine());
		for(int i=0 ; i<N ; i++) {
			int temp = Integer.parseInt(br.readLine());
			sb.append(check(temp)+"\n");
		}
		br.close();


		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}