import java.io.*;
import java.util.*;

public class P1911 {
    static class Info implements Comparable<Info>{
        int s, e;
        public Info(int s, int e){
            this.s = s;
            this.e = e;
        }

        public int compareTo(Info o) {
            if(this.s == o.s)
                return o.e - this.e;
            return this.s - o.s;
        }
    }
    
    static int N, L;
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        
        N = Integer.parseInt(st.nextToken());
        L = Integer.parseInt(st.nextToken());
        
        PriorityQueue<Info> PQ = new PriorityQueue<>();
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine(), " ");
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            PQ.offer(new Info(s, e));
        }
        int ans = 0;	
        int fill = 0;	
        while(!PQ.isEmpty()){
            Info cur = PQ.poll();
            if(cur.e < fill)
                continue;

            if(fill < cur.s)
                fill = cur.s;

            int remain = (cur.e - fill) % L;
            ans += (cur.e - fill) / L;
            fill = cur.e;

            if(remain != 0) {
                ans++;
                fill += L - remain;
            }

        }
        
        sb.append(ans);
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}