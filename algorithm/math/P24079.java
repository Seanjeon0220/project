import java.io.*;

public class P24079 {
		
	static int X, Y, Z, sum;
	
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	StringBuilder sb = new StringBuilder();
    	
    	X = Integer.parseInt(br.readLine());
    	Y = Integer.parseInt(br.readLine());
    	Z = Integer.parseInt(br.readLine());
        br.close();
        
        sum = X+Y;
        
        if(sum <= Z) {
        	sb.append(1);
        }else {
        	sb.append(0);
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}

