import java.util.*;
import java.io.*;

public class P10818 {
    public static void main(String[] args) throws IOException{
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
      StringBuilder sb=new StringBuilder();
      
      int n = Integer.parseInt(br.readLine());
      int[] whole = new int[n];
      int max = -1000001;
      int min = 1000001;
      StringTokenizer st = new StringTokenizer(br.readLine());
      
      for (int i=0 ; i< n ; i++) {
    	  int num = Integer.parseInt(st.nextToken());
    	  whole[i] = num;
      }
      
      for (int j=0 ; j<n ; j++) {
    	  min = Math.min(min, whole[j]);
    	  max = Math.max(max, whole[j]);
      }
           
      sb.append(min + " " + max);
      bw.write(sb.toString());
      bw.close();
      br.close();
  }
}