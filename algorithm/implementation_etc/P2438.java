import java.io.*;
import java.util.StringTokenizer;

public class P2438 {
	
    public static void main(String[] args) throws IOException{
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
      StringBuilder sb=new StringBuilder();
      
      int n = Integer.parseInt(br.readLine());
      
      for (int i=1 ; i< n+1 ; i++) {
    	  for (int j=0 ; j<i ; j++) {
    		  sb.append("*");
    	  }
    	  sb.append("\n");
      }
           
      bw.write(sb.toString());
      bw.close();
      br.close();
  }
}