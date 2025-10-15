import java.io.*;

public class P5358 {
	
	static int N;
	
	public static String check(String temp) {
		String result = Character.toString(temp.charAt(0));
		for(int i=1 ; i<temp.length() ; i++) {
			if(temp.charAt(i) != temp.charAt(i-1)) {
				result += Character.toString(temp.charAt(i));
			}
		}
		return result;
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		N = Integer.parseInt(br.readLine());
		
		for(int i=0 ; i<N ; i++) {
			String temp = br.readLine();
			sb.append(check(temp)+"\n");
		}
		br.close();
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}

}