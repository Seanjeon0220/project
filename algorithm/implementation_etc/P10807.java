import java.util.*;
import java.io.*;

public class P10807 {
    public static void main(String[] args) throws IOException{
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
      StringBuilder sb=new StringBuilder();
      
      int n = Integer.parseInt(br.readLine());
      int count = 0;
      int[] whole = new int[n];
      StringTokenizer st = new StringTokenizer(br.readLine());
      
      for (int i=0 ; i< n ; i++) {
    	  int num = Integer.parseInt(st.nextToken());
    	  whole[i] = num;
      }
      
      int check = Integer.parseInt(br.readLine());
      
      for (int j=0 ; j<n ; j++) {
    	  if(whole[j] == check) {
    		  count+=1;
    	  }
      }
           
      sb.append(count);
      bw.write(sb.toString());
      bw.close();
      br.close();
  }
}