import java.io.*;

public class P30676 {
	
	static int N;
	
	public static String color(int n) {
		if(n >= 620) {
			return "Red";
		}else if(n >= 590) {
			return "Orange";
		}else if(n >= 570) {
			return "Yellow";
		}else if(n >= 495) {
			return "Green";
		}else if(n >=450) {
			return "Blue";
		}else if(n >= 425) {
			return "Indigo";
		}
		return "Violet";
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		N = Integer.parseInt(br.readLine());
		br.close();
		
		sb.append(color(N));
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
