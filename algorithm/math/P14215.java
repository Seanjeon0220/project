import java.io.*;

public class P14215 {
	
	static int a, b, c, ans;
	
	public static int triangle(int a, int b, int c) {
		
		int temp = Math.max(a,  b);
		int max = Math.max(temp,  c);
		int sum = a + b + c;
		
		if (sum-max <=max) {
			return (sum-max)*2-1;
		}
		
		return sum;
		
	}
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        String[] total = br.readLine().split(" ");
        a = Integer.parseInt(total[0]);
        b = Integer.parseInt(total[1]);
        c = Integer.parseInt(total[2]);
                
        ans = triangle(a, b, c);
        sb.append(ans);
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
        
    }

}