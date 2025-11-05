import java.io.*;

public class P31922 {
	
	static int A, P, C, one, two;

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		String[] temp = br.readLine().split(" ");
		
		A = Integer.parseInt(temp[0]);
		P = Integer.parseInt(temp[1]);
		C = Integer.parseInt(temp[2]);
		
		one = A + C;
		two = P;
		
		if(one > two) {
			sb.append(one);
		}else {
			sb.append(two);
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}

}
