import java.util.*;
import java.io.*;

public class P25304 {
    public static void main(String[] args) throws IOException{
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
      StringBuilder sb=new StringBuilder();
      
      int total = Integer.parseInt(br.readLine());
      int n = Integer.parseInt(br.readLine());
      int realTotal = 0;
      
      for (int i=0 ; i< n ; i++) {
    	  StringTokenizer st = new StringTokenizer(br.readLine());
    	  int a = Integer.parseInt(st.nextToken());
    	  int b = Integer.parseInt(st.nextToken());
    	  realTotal += a*b;
      }
      
      if (total == realTotal) {
    	  sb.append("Yes");
      }else {
    	  sb.append("No");
      }
           
      bw.write(sb.toString());
      bw.close();
      br.close();
  }
}