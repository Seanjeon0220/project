import java.io.*;
import java.util.*;

public class P24542 {
    static boolean[] visited;
    static ArrayList<ArrayList<Integer>> Edge;

    static long DFS(int node) {
        long cnt = 1;
        for (int next : Edge.get(node)) {
            if (visited[next]) continue;
            visited[next] = true;
            cnt += DFS(next);
        }
        return cnt;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        visited = new boolean[N + 1];
        Edge = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            Edge.add(new ArrayList<>());
        }

        for (int m = 1; m <= M; m++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            Edge.get(u).add(v);
            Edge.get(v).add(u);
        }

        long ans = 1;
        for (int i = 1; i <= N; i++) {
            if (visited[i]) continue;
            visited[i] = true;
            ans = (ans * DFS(i)) % 1000000007;
        }

        bw.write(Long.toString(ans));
        bw.newLine();
        
        br.close();
        bw.close();
    }
}
