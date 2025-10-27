import java.io.*;

public class P24083 {
		
	static int A, B, temp;
	
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	StringBuilder sb = new StringBuilder();
    	
    	A = Integer.parseInt(br.readLine());
    	B = Integer.parseInt(br.readLine());
        br.close();
        
        if((A+B)%12 == 0) {
        	temp = 12;
        }else {
        	temp = (A+B)%12;
        }
        
       
        sb.append(temp);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}

