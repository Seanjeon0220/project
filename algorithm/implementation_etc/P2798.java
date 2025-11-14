import java.io.*;

public class P2798 {
	
	static int N, M, total[];
	
	public static int maximum(int[] arr, int M) {
		int size = arr.length;
		int max = 0;
		
		for(int i=0 ; i<size ; i++) {
			for (int j=i+1; j<size; j++) {
				for(int k=j+1;k<size;k++) {
					int sum = arr[i]+arr[j] +arr[k];
					if(sum > max && sum<=M) {
						max = sum;
					}
				}
			}
			
		}
		return max;
	}
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        String[] temp1 = br.readLine().split(" ");
        String[] temp2 = br.readLine().split(" ");
        
        N = Integer.parseInt(temp1[0]);
        M = Integer.parseInt(temp1[1]);
        total = new int[N];
        
        for (int i=0 ; i<N ; i++) {
        	total[i] = Integer.parseInt(temp2[i]);
        }
        
        int ans = maximum(total, M);
               
        sb.append(ans);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }
}