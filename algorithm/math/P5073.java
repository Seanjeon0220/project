import java.io.*;

public class P5073 {
	
	static int a, b, c;
	static String ans;
	
	public static String triangle(int a, int b, int c) {
		
		int temp = Math.max(a,  b);
		int max = Math.max(temp,  c);
		int sum = a + b+ c;
		
		if (sum-max <= max) {
			return "Invalid";
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
        
        while (true) {
        	String[] total = br.readLine().split(" ");
        	a = Integer.parseInt(total[0]);
        	b = Integer.parseInt(total[1]);
        	c = Integer.parseInt(total[2]);
        	
        	if (a == 0) {
        		break;
        	}
        	
        	ans = triangle(a, b, c);
        	sb.append(ans+"\n");
        	
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
        
    }

}