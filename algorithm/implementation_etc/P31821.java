import java.io.*;

public class P31821{
	
	static int N, M, sum = 0;

	public static void main(String[] args)  throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		N = Integer.parseInt(br.readLine());
		int[] menu = new int[N];
		
		for (int i=0 ; i<N ; i++) {
			int temp = Integer.parseInt(br.readLine());
			
			menu[i] = temp;
		}
		
		M = Integer.parseInt(br.readLine());
		
		for (int j=0 ; j<M ; j++) {
			int tempe = Integer.parseInt(br.readLine());
			sum += menu[tempe-1];
		}
		
		sb.append(sum);
		
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		
		

	}

}
