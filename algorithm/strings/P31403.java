import java.io.*;

public class P31403 {
	
	static int Ia, Ib, Ic, Ians, Sans;
	static String Sa, Sb, Sc;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringBuilder sb = new StringBuilder();
		
		Sa = br.readLine();
		Sb = br.readLine();
		Sc = br.readLine();
		br.close();
		
		Ia = Integer.parseInt(Sa);
		Ib = Integer.parseInt(Sb);
		Ic = Integer.parseInt(Sc);
		
		Ians = Ia + Ib - Ic;
		Sans = Integer.parseInt(Sa + Sb) - Ic;
		
		sb.append(Ians +"\n" + Sans);


		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}