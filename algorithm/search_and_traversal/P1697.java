import java.io.*;
import java.util.*;

public class P1697 {
    
	static int N, K, check[];
	static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException{
        
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	
    	String total[] = br.readLine().split(" ");
    	
    	N = Integer.parseInt(total[0]);
    	K = Integer.parseInt(total[1]);
    	check = new int[100001];

        if (N == K) {
            System.out.println(0);
        } else {
            bfs(N);
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
        
    }

    static void bfs(int num) {
        Queue<Integer> q = new LinkedList<>();
        q.add(num);
        check[num] = 1;

        while (!q.isEmpty()) {
            int temp = q.poll();

            for (int i = 0; i < 3; i++) {
                int next;

                if (i == 0) {
                    next = temp + 1;
                } else if (i == 1) {
                    next = temp - 1;
                } else {
                    next = temp * 2;
                }

                if (next == K) {
                    sb.append(check[temp]);
                    return;
                }

                if (next >= 0 && next < check.length && check[next] == 0) {
                    q.add(next);
                    check[next] = check[temp] + 1;
                }
            }
        }
    }
}