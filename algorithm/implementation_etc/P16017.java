import java.io.*;

public class P16017 {
	
	static int a, b, c, d;
	
	public static String check(int a, int b, int c, int d) {
		if(a != 8 && a!= 9) {
			return "answer";
		}
		if(b != c) {
			return "answer";
		}
		
		if(d!= 8 && d!=9) {
			return "answer";
		}
		
		return "ignore";
	}
	
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        a = Integer.parseInt(br.readLine());
        b = Integer.parseInt(br.readLine());
        c = Integer.parseInt(br.readLine());
        d = Integer.parseInt(br.readLine());
        br.close();
        
        sb.append(check(a,b,c,d));
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}
