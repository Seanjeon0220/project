import java.io.*;
 
public class P7595 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        while(true) {
        	int temp = Integer.parseInt(br.readLine());
        	if(temp == 0) {
        		break;
        	}else {
        		for(int i=1; i<=temp ; i++) {
        			for(int j=1 ; j<=i; j++) {
        				sb.append("*");
        			}
        			sb.append("\n");
        		}
        	}
        }
        br.close();
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
