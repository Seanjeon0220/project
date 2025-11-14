import java.io.*;

public class P10809 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
		
        String s = br.readLine();
		
		int[] arr = new int[26];
		for (int i = 0; i < 26; i++) {
			arr[i] = -1;
		}		
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (arr[ch - 'a'] == -1) {
				arr[ch - 'a'] = i;
			}
		}
		for (int var : arr) {
			sb.append(var + " ");
		}
		
		bw.write(sb.toString());
        br.close();
        bw.close();
	}
}