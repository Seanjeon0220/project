import java.io.*;
import java.util.*;

public class P9772{
	
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        while(true) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	double x = Double.parseDouble(st.nextToken());
        	double y = Double.parseDouble(st.nextToken());
        	if(x == 0 && y == 0) {
        		sb.append("AXIS"+"\n");
        		break;
        	}else {
        		if(x==0 || y ==0 ) {
        			sb.append("AXIS"+"\n");
        		}else if(x > 0 && y > 0) {
        			sb.append("Q1" + "\n");
        		}else if (x > 0 && y < 0) {
        			sb.append("Q4"+"\n");
        		}else if(x < 0 && y > 0) {
        			sb.append("Q2"+"\n");
        		}else {
        			sb.append("Q3"+"\n");
        		}
        	}
        	
        }
        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}
