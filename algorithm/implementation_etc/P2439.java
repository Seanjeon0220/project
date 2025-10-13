import java.io.*;

public class P2439 {
	
    public static void main(String[] args) throws IOException{
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
      StringBuilder sb=new StringBuilder();
      
      int n = Integer.parseInt(br.readLine());
      
      for (int i=1 ; i< n+1 ; i++) {
    	  for (int j=0 ; j<n-i ; j++) {
    		  sb.append(" ");
    	  }
    	  for (int k=i ; k>0 ; k--) {
    		  sb.append("*");
    	  }
    	  sb.append("\n");
      }
           
      bw.write(sb.toString());
      bw.close();
      br.close();
  }
}