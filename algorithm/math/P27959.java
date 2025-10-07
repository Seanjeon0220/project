import java.io.*;

public class P27959 {
	
	static int a,b;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		String total[] = br.readLine().split(" ");
		br.close();
		
		a = Integer.parseInt(total[0]);
		b = Integer.parseInt(total[1]);
		
		if(a*100 >= b) {
			sb.append("Yes");
		}else {
			sb.append("No");
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}	

}
