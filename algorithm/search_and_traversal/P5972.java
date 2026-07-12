import java.io.*;
import java.util.*;

@SuppressWarnings("unchecked")
public class P5972 {
    
    static int n, m;
    static int[] dist;
    static ArrayList<Node>[] list;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nm = br.readLine().split(" ");
        n = Integer.parseInt(nm[0]);
        m = Integer.parseInt(nm[1]);

        list = new ArrayList[n + 1];
        for(int i = 1; i <= n; i++) {
            list[i] = new ArrayList<>();
        }
        
        for(int i = 0; i < m; i++) {
            String[] input = br.readLine().split(" ");
            int s = Integer.parseInt(input[0]);
            int e = Integer.parseInt(input[1]);
            int cost = Integer.parseInt(input[2]);
            list[s].add(new Node(e, cost));
            list[e].add(new Node(s, cost));
        }

        visited = new boolean[n + 1];
        dist = new int[n + 1];
        Arrays.fill(dist, 50000001);
        dijkstra();
        bw.write(dist[n] + "\n");

        br.close();
        bw.close();
    }

    public static void dijkstra() {
        PriorityQueue<Node> q = new PriorityQueue<>();
        dist[1] = 0; 
        q.offer(new Node(1, 0));

        while(!q.isEmpty()) {
            Node current = q.poll();

            if(!visited[current.d]) visited[current.d] = true;
            else continue;

            for(int i = 0; i < list[current.d].size(); i++) {
                Node next = list[current.d].get(i);
                if(dist[next.d] > dist[current.d] + next.cost) {
                    dist[next.d] = dist[current.d] + next.cost;
                    q.offer(new Node(next.d, dist[next.d]));
                }
            }
        }
    }

    public static class Node implements Comparable<Node> {
        int d;
        int cost;

        public Node(int d, int cost) {
            this.d = d;
            this.cost = cost;
        }

        public int compareTo(Node n) {
            return this.cost - n.cost;
        }
    }
}

