import java.io.*;

public class P26575 {
	
	static int N;
	
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
    	
        N = Integer.parseInt(br.readLine());
        for(int i=0 ; i<N ; i++) {
        	String total[] = br.readLine().split(" ");
        	double A = Double.parseDouble(total[0]);
        	double B = Double.parseDouble(total[1]);
        	double C = Double.parseDouble(total[2]);
        	
        	String ans = String.format("%.2f", A*B*C);
        	sb.append("$" + ans+"\n");
        }
        
        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}