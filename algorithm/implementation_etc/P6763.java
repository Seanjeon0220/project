import java.io.*;

public class P6763 {

	static int A,B, D;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		A = Integer.parseInt(br.readLine());
		B = Integer.parseInt(br.readLine());
		br.close();
		
		D = B-A;
		
		if(D <= 0) {
			sb.append("Congratulations, you are within the speed limit!");
		}else if(D<=20) {
			sb.append("You are speeding and your fine is $100.");
		}else if(D<=30) {
			sb.append("You are speeding and your fine is $270.");
		}else {
			sb.append("You are speeding and your fine is $500.");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}

}