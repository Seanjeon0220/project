import java.io.*;

public class P17009 {
	
	static int A3, A2, A1, B3, B2, B1, AT, BT;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		A3 = Integer.parseInt(br.readLine());
		A2 = Integer.parseInt(br.readLine());
		A1 = Integer.parseInt(br.readLine());
		B3 = Integer.parseInt(br.readLine());
		B2 = Integer.parseInt(br.readLine());
		B1 = Integer.parseInt(br.readLine());
		br.close();
		
		AT = A3*3 + A2*2 + A1*1;
		BT = B3*3 + B2*2 + B1*1;
		
		if(AT > BT) {
			sb.append("A");
		}else if(AT < BT) {
			sb.append("B");
		}else {
			sb.append("T");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}

}