import java.io.*;

public class P31615 {
	
	static int A, B, SUM;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		A = Integer.parseInt(br.readLine());
		B = Integer.parseInt(br.readLine());
		br.close();
		
		SUM = A + B;
		
		if(SUM < 10) {
			sb.append(1);
		}else if(SUM < 100) {
			sb.append(2);
		}else {
			sb.append(3);
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	
	}
}