import java.io.*;

public class P23825 {
	
	static int S, A, ST, AT;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		String temp[] = br.readLine().split(" ");
		br.close();
		S = Integer.parseInt(temp[0]);
		A = Integer.parseInt(temp[1]);
		
		ST = S/2;
		AT = A/2;
		
		sb.append(Math.min(AT, ST));
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	
	}
}
