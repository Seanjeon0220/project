import java.io.*;
import java.util.*;

public class P1068 {
 
    static int n, delete;
    static int[] parent;
    static int count;
    static boolean[] visited;
    
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        n = Integer.parseInt(br.readLine());
        
        parent = new int[n];
        st = new StringTokenizer(br.readLine());
        
        int root = 0;
        for(int i = 0; i < n; i++) {
            parent[i] = Integer.parseInt(st.nextToken());        
            if(parent[i] == -1) root = i;
        }
        delete = Integer.parseInt(br.readLine());
        
        deleteNode(delete);
            
        count = 0;
        visited = new boolean[n];
        countLeaf(root);
            
        sb.append(count);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
    
    public static void deleteNode(int d) {
        parent[d] = -2; 
        for(int i = 0; i < n; i++) {
            if(parent[i] == d) {
                deleteNode(i);
            }
        }
    }
    
    public static void countLeaf(int s) {
        boolean isLeaf = true;
        visited[s] = true;
        if(parent[s] != -2) {
            for(int i = 0; i < n; i++) {
                if(parent[i] == s && visited[i] == false) {
                    countLeaf(i);
                    isLeaf = false;
                }
            }
            if(isLeaf) count++;
        }
    }
}
