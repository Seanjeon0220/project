import java.util.*;
import java.io.*;

public class P14171 {
    public static void main(String[] args) throws IOException{
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
      StringBuilder sb=new StringBuilder();
      StringTokenizer st;
      
      int n = Integer.parseInt(br.readLine());
      HashMap<String, Integer> h = new HashMap<>();
      
      for (int i=0;i<n;i++){
          st=new StringTokenizer(br.readLine());
          String city = st.nextToken();
          String state = st.nextToken();
          if (!city.substring(0,2).equals(state)){
              String key = city.substring(0,2)+state;
              if (h.containsKey(key)){
                  h.put(key,h.get(key)+1);
              }else{
                  h.put(key,1);
              }

          }
      }
              
    int ans=0;
          
    for (String key : h.keySet()){
        String otherKey = key.substring(2) + key.substring(0,2);
        if (h.containsKey(otherKey)){
            ans += h.get(key)*h.get(otherKey);
        }
    }
          
    ans/=2;
          
    sb.append(ans);
    bw.write(sb.toString());
    bw.close();
    br.close();
  }
}