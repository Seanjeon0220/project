import java.io.*;;

public class P29736 {
	
	static int A, B, K, X, ans;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String total1[] = br.readLine().split(" ");
        String total2[] = br.readLine().split(" ");
        br.close();
        
        A = Integer.parseInt(total1[0]);
        B = Integer.parseInt(total1[1]);
        K = Integer.parseInt(total2[0]);
        X = Integer.parseInt(total2[1]);

        ans = 0;
        
        for(int i=K-X; i<K+X+1; i++) {
            if(i < A || i > B) continue;
            ans++;
        }

        if(ans == 0) {
        	System.out.print("IMPOSSIBLE");
        }else {
        	System.out.print(ans);
        }
        bw.close();
        br.close();
    }
}
