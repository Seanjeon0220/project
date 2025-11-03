import java.io.*;

public class P30501 {
	
	static int N;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		N = Integer.parseInt(br.readLine());
		for(int i=0 ; i<N ; i++) {
			String temp = br.readLine();
			for(int j=0 ; j<temp.length() ; j++) {
				if(temp.charAt(j) == 'S') {
					sb.append(temp);
					break;
				}
			}
		}
		br.close();


		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}