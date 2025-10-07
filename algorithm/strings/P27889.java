import java.io.*;

public class P27889 {
	
	static String name;

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		name = br.readLine();
		br.close();
		
		if(name.charAt(0) == 'N') {
			sb.append("North London Collegiate School");
		}else if(name.charAt(0) == 'B') {
			sb.append("Branksome Hall Asia");
		}else if(name.charAt(0) == 'K') {
			sb.append("Korea International School");
		}else {
			sb.append("St. Johnsbury Academy");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}	

}
