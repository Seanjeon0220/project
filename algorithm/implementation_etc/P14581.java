import java.io.*;

public class P14581 {
	
	static String name;

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		name = br.readLine();
		br.close();
		
		sb.append(":fan::fan::fan:"+"\n");
		sb.append(":fan::"+ name +"::fan:"+"\n");
		sb.append(":fan::fan::fan:"+"\n");
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
