import java.io.*;

public class P25314 {
    public static void main(String[] args) throws IOException{
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
      StringBuilder sb=new StringBuilder();
      
      int n = Integer.parseInt(br.readLine());
      
      for (int i=1; i<=n/4 ; i++) {
    	  sb.append("long ");
      }
      sb.append("int");
           
      bw.write(sb.toString());
      bw.close();
      br.close();
  }
}