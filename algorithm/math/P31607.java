import java.io.*;
import java.util.Arrays;
 
public class P31607 {
	
	static int[] arr = new int[3];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		for(int i=0 ; i<3 ; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);
		
		if(arr[2] == arr[0] + arr[1]) {
			sb.append(1);
		}else{
			sb.append(0);
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}