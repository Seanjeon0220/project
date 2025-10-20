import java.io.*;
 
public class P11720 {
	public static void main(String[] args) throws IOException {		
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
		br.readLine();	
		
		int sum = 0;
		
		for(byte value : br.readLine().getBytes()) {
			sum += (value - '0');
		}
		
		sb.append(sum);
		
		bw.write(sb.toString());
        br.close();
        bw.close();
		
	}
}