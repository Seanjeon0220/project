import java.util.*;
import java.io.*;

public class P2562 {
    public static void main(String[] args) throws IOException{
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
      StringBuilder sb=new StringBuilder();
      
      int[] whole = new int[9];
      int max = 0;
      int ind = -1;
      
      
      for (int i=0 ; i< 9 ; i++) {
    	  StringTokenizer st = new StringTokenizer(br.readLine());
    	  int num = Integer.parseInt(st.nextToken());
    	  whole[i] = num;
      }
      
      for (int j=0 ; j<9 ; j++) {
    	  if(whole[j] > max) {
    		  max = whole[j];
    		  ind = j;
    	  }
    	  
      }
           
      sb.append(max + "\n" + (ind+1));
      bw.write(sb.toString());
      bw.close();
      br.close();
  }
}