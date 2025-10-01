import java.io.*;
import java.util.StringTokenizer;

public class P11022{
    public static void main(String[] args) throws IOException{
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
      StringBuilder sb=new StringBuilder();
      
      int n = Integer.parseInt(br.readLine());
      
      for (int i=0 ; i< n ; i++) {
    	  StringTokenizer st = new StringTokenizer(br.readLine());
    	  int a = Integer.parseInt(st.nextToken());
    	  int b = Integer.parseInt(st.nextToken());
    	  int total = a+b;
    	  sb.append("Case #"+(i+1)+": "+ a + " + " + b + " = " +total);
    	  sb.append("\n");
      }
           
      bw.write(sb.toString());
      bw.close();
      br.close();
  }
}