import java.io.*;

public class P10101 {
	
	static int a, b, c;
	
	public static String triangle(int a, int b, int c) {
		if(a+b+c != 180) {
			return "Error";
		}
		
		if(a == b && b == c) {
			return "Equilateral";
		}
		
		if (a == b || b == c || c == a) {
			return "Isosceles";
		}
		
		return "Scalene";
	}
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        a = Integer.parseInt(br.readLine());
        b = Integer.parseInt(br.readLine());
        c = Integer.parseInt(br.readLine());
        
        sb.append(triangle(a, b, c));
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
        
    }

}