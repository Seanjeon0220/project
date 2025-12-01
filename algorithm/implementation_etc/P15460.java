import java.util.*;
import java.io.*;

public class P15460 {
    public static void main(String[] args) throws IOException{
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
      StringBuilder sb=new StringBuilder();
      StringTokenizer st;
      
      
      int n = Integer.parseInt(br.readLine());
      st = new StringTokenizer(br.readLine());
      int[] a = new int[n];
      for(int i=0;i<n;i++){
        a[i] = Integer.parseInt(st.nextToken());
      }
      
      int[] suffix_sum = new int[n];
      int[] suffix_min = new int[n];
      
      suffix_sum[n-1] = suffix_min[n-1] = a[n-1];
      for (int i=n-2;i>-0;i--){
        suffix_sum[i] = suffix_sum[i+1]+a[i];
        suffix_min[i] = Math.min(suffix_min[i+1],a[i]);
      }
      
      ArrayList<Integer> ans=new ArrayList<>();
      
      double max_avg = 0;
      
      for(int i=0;i<n-2;i++){
        double avg = (suffix_sum[i+1]-suffix_min[i+1])/(double)(n-2-i);
        if (avg>max_avg){
          max_avg = avg;
          ans.clear();
          ans.add(i+1);
        }else if(avg == max_avg){
          ans.add(i+1);
        }
      }
      
      for (int i : ans){
        sb.append(i+" ");
      }
      
      bw.write(sb.toString());
      bw.close();
      br.close();
  }
}