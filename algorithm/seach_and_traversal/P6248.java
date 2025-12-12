import java.io.*;
import java.util.*;

public class P6248 {
    static ArrayList<pii>[] adj;
    static int INF = 1000000007;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        
        adj = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            adj[i] = new ArrayList<>();
        }

        while (m-- > 0) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            adj[a].add(new pii(b, c));
            adj[b].add(new pii(a, c));
        }

        int[] dist = dijkstra(x, n);
        int mx = 0;
        for (int i = 1; i <= n; i++) {
            mx = Math.max(mx, dist[i]);
        }
        bw.write(mx * 2 + "\n");

        bw.flush();
        br.close();
        bw.close();
    }

    static int[] dijkstra(int st, int n) {
        int[] dist = new int[n + 1];
        Arrays.fill(dist, INF);
        dist[st] = 0;
        PriorityQueue<pii> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a.X));
        pq.add(new pii(0, st));
        
        while (!pq.isEmpty()) {
            pii cur = pq.poll();
            int curNode = cur.Y;
            int curDist = cur.X;

            if (curDist > dist[curNode]) continue;

            for (pii next : adj[curNode]) {
                int nextNode = next.X;
                int nextDist = next.Y;

                if (dist[nextNode] > curDist + nextDist) {
                    dist[nextNode] = curDist + nextDist;
                    pq.add(new pii(dist[nextNode], nextNode));
                }
            }
        }

        return dist;
    }

    static class pii {
        int X, Y;
        
        pii(int X, int Y) {
            this.X = X;
            this.Y = Y;
        }
    }
}
