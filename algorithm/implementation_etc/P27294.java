import java.io.*;

public class P27294 {
	
	static int N, a1, a2;
	
	public static int check(int a, int b) {
		if(b==0) {
			if(a>=12 && a<=16) {
				return 320;
			}
		}
		return 280;
	}

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		String total[] = br.readLine().split(" ");
		br.close();
		int a = Integer.parseInt(total[0]);
		int b = Integer.parseInt(total[1]);
		
		sb.append(check(a,b));
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}	

}
