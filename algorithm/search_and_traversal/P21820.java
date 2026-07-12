import java.io.*;
import java.util.*;

public class P21820 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N, L;

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        L = Integer.parseInt(st.nextToken());
        Integer[] c = new Integer[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            c[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(c,Comparator.reverseOrder());
        int h = c.length;
        while (h>0 && c[h-1]<h) {
        	h--;
        }
        
        if (h!=N) {
        	for (int i = h ; i>=0 && i>h-L ; i--) {
        		c[i]++;
        	}
        }
        
        Arrays.sort(c,Comparator.reverseOrder());
        h = c.length;
        while (h>0 && c[h-1]<h) {
        	h--;
        }
        
        sb.append(h);
        
        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
