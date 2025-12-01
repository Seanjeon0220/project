import java.io.*;
 
public class P1541 {
 
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		int sum = Integer.MAX_VALUE; 
		String[] subtraction = br.readLine().split("-");
		
 
		for(int i = 0; i < subtraction.length; i++) {
			int temp = 0;
 
			String[] addition = subtraction[i].split("\\+");

			for(int j = 0; j < addition.length; j++) {
				temp += Integer.parseInt(addition[j]);
			}
			
			if (sum == Integer.MAX_VALUE) {
				sum = temp;
			} else {
				sum -= temp;
			}
		}
		sb.append(sum);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}