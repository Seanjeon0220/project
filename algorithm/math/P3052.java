import java.io.*;

public class P3052 {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] arr = new int[10];
		boolean bl; 
		int cnt = 0;

		for(int i=0; i<arr.length; i++ ) {
			arr[i] = Integer.parseInt(br.readLine()) % 42;
		}
		for(int i=0; i<10; i++ ) {
			bl = false;
			for(int k=i+1; k<arr.length; k++ ) {
				if( arr[i] == arr[k] ) { 
					bl = true;
					break; 
				}
			}
			if( bl == false ) {
				cnt++; 
			} 
		}
		System.out.println(cnt);
	}
}