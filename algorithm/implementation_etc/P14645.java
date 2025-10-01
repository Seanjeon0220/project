import java.io.*;

public class P14645 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		String total[] = br.readLine().split(" ");
		int N = Integer.parseInt(total[0]);
		
		for(int i=0 ; i<N ; i++) {
			br.readLine();	
		}
		br.close();
		
		sb.append("비와이");
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}	

}
