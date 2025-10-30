import java.io.*;

public class P26592 {
	
	static int N;
	
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());
        
        for (int i=0 ; i<N ; i++) {
        	String[] total = br.readLine().split(" ");
        	double area = Double.parseDouble(total[0]);
        	double base = Double.parseDouble(total[1]);
        	
        	double h = 2*area / base;
        	String ans = String.format("%.2f", h);
         	sb.append("The height of the triangle is "+ ans + " units\n");
         	
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

}