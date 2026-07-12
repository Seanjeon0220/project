import java.io.*;
import java.util.*;

public class P11478 {
	
	public static void main (String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		String word = br.readLine();
		Set<String> set = new HashSet<>();

		for (int i = 0; i < word.length(); i++) {
		   for (int j = i + 1; j <= word.length(); j++) {
		      set.add(word.substring(i, j));
		   }
		}

		int ans = set.size();
		
		sb.append(ans);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}
