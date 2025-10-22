import java.io.*;

public class P15025 {
	
	static int A, B;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		String temp[] = br.readLine().split(" ");
		A = Integer.parseInt(temp[0]);
		B = Integer.parseInt(temp[1]);
		br.close();
		
		if(A == 0 && B == 0) {
			sb.append("Not a moose");
		}else {
			if(A == B) {
				sb.append("Even " + 2*A);
			}else {
				if(A > B) {
					sb.append("Odd " + 2*A);
				}else {
					sb.append("Odd " + 2*B);
				}
			}
		}


		bw.write(sb.toString());
		bw.flush();
		bw.close(); 
	}
}