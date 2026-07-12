import java.io.*;
import java.util.*;

public class P13549 {
    static class Loc{
        int idx;
        int time;

        public Loc(int idx, int time) {
            this.idx = idx;
            this.time = time;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String[] inputs = br.readLine().split(" ");

        int n = Integer.parseInt(inputs[0]);
        int k = Integer.parseInt(inputs[1]);
        br.close();

        int[]  visited = new int[100001];

        Queue<Loc> q = new LinkedList<>();
        q.add(new Loc(n, 1));
        visited[n] = 1; 

        while (!q.isEmpty()) {
            Loc now = q.poll();

            if(now.idx+1>=0 && now.idx+1<=100000){
                if(visited[now.idx+1] == 0 || visited[now.idx+1] > now.time+1){
                    visited[now.idx+1] = now.time+1;
                    q.add(new Loc(now.idx + 1, now.time + 1));
                }
            }

            if(now.idx-1>=0 && now.idx-1<=100000){
                if(visited[now.idx-1] == 0 || visited[now.idx-1] > now.time+1) {
                    visited[now.idx - 1] = now.time + 1;
                    q.add(new Loc(now.idx - 1, now.time + 1));
                }
            }

            if(now.idx*2>=0 && now.idx*2<=100000){
                if(visited[now.idx*2] == 0 || visited[now.idx*2] > now.time) {
                    visited[now.idx*2] = now.time;
                    q.add(new Loc(now.idx*2, now.time));
                }
            }

        }

        sb.append(visited[k]-1);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}