import java.io.*;

public class P21300 {
	
	static int sum;
	
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
    	
        String total[] = br.readLine().split(" ");
        br.close();
        
        sum = 0;
        for(int i=0 ; i<6 ; i++) {
        	sum += Integer.parseInt(total[i]) * 5;
        }
        
        sb.append(sum);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}