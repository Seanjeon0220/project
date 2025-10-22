import java.io.*;

public class P14935 {
	
	static int X;
	
	public static void main(String[] args) throws IOException{
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		sb.append("FA");

		bw.write(sb.toString());
		bw.flush();
		bw.close(); 
	}
}