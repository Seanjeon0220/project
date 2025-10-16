import java.io.*;

public class P6825 {
	
	static double w, h;
	static StringBuilder sb = new StringBuilder();
	
	public static void check(double w, double h) {
		double temp = w/(h*h);
		
		if(temp >25) {
			sb.append("Overweight");
		}else if(temp >= 18.5) {
			sb.append("Normal weight");
		}else {
			sb.append("Underweight");
		}
	}
	
	public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	        w = Double.parseDouble(br.readLine());
	        h = Double.parseDouble(br.readLine());
	        
	        br.close();
	        
	        check(w,h);
	        
	        bw.write(sb.toString());
	        bw.flush();
	        bw.close();
	        
	    }
}