import java.io.*;

public class P19944{
	
	static int N, M;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		String temp[] = br.readLine().split(" ");
		br.close();
		N = Integer.parseInt(temp[0]);
		M = Integer.parseInt(temp[1]);
		
		if(M==1 || M==2) {
			sb.append("NEWBIE!");
		}else if(M <= N) {
			sb.append("OLDBIE!");
		}else {
			sb.append("TLE!");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}

}