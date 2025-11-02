import java.io.*;

public class P29731 {
	
	static int N;
	static String total[];
	
	public static String check(String[] total) {
		for(String temp : total) {
			if(temp.equals("Never gonna give you up") || temp.equals("Never gonna let you down") || temp.equals("Never gonna run around and desert you") || temp.equals("Never gonna make you cry") || temp.equals("Never gonna say goodbye") || temp.equals("Never gonna say goodbye") || temp.equals("Never gonna tell a lie and hurt you") || temp.equals("Never gonna stop")) {
				continue;
			}else {
				return "Yes";
			}
		}
		return "No";
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		N = Integer.parseInt(br.readLine());
		total = new String[N];
		for(int i=0 ; i<N ; i++) {
			total[i] = br.readLine();
		}
		br.close();
		
		sb.append(check(total));
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}	

}
