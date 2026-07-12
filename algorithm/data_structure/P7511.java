import java.io.*;
import java.util.*;

public class P7511 {
    static int N, K, M, parent[];
    static StringTokenizer st;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        int tc = stoi(br.readLine());
        for(int t = 1; t <= tc; t++) {
            N = stoi(br.readLine());
            K = stoi(br.readLine());
            parent = new int[N];
            Arrays.fill(parent, -1);
            
            for(int i = 0; i < K; i++) {
                st = new StringTokenizer(br.readLine());
                int a = stoi(st.nextToken());
                int b = stoi(st.nextToken());
                union(a, b);
            }

            M = stoi(br.readLine());
            sb.append(String.format("Scenario %d:%n", t));
            for(int i = 0; i < M; i++) {
                st = new StringTokenizer(br.readLine());
                int u = stoi(st.nextToken());
                int v = stoi(st.nextToken());
                if(find(u) == find(v)) {
                	sb.append(1 + "\n");
                }else {
                    sb.append(0 + "\n");
                }
            }
            sb.append("\n"); 
        }
        
        bw.write(sb.toString());
        br.close();
        bw.flush();
        bw.close();
    }

    public static int find(int n) {
        if(parent[n] < 0) {
        	return n;
        }
        return parent[n] = find(parent[n]);
    }

    public static void union(int a, int b) {
        a = find(a);
        b = find(b);
        if(a == b) {
        	return;
        }
        if(parent[a] < parent[b]) {
            parent[a] += parent[b];
            parent[b] = a;
        } else {
            parent[b] += parent[a];
            parent[a] = b;
        }
    }

    public static int stoi(String s) {
        return Integer.parseInt(s);
    }
}
