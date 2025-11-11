import java.io.*;

public class P5086 {
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        while (true) {
        	String ip = br.readLine();
        	String[] temp = ip.split(" ");
        	int a = Integer.parseInt(temp[0]);
        	int b = Integer.parseInt(temp[1]);
        	if (a == 0) {
        		break;
        	}else {
        		if (b%a == 0) {
        			sb.append("factor\n");
        		}else if(a%b == 0) {
        			sb.append("multiple\n");
        		}else {
        			sb.append("neither\n");
        		}
        	}
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}