import java.io.*;

public class P31656 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String line = br.readLine();
		br.close();
		int len = line.length();
		String ans = line.substring(0,1);
		
		for(int i=1 ; i<len ; i++) {
			String temp = line.substring(i,i+1);
			if(!temp.equals(line.subSequence(i-1, i))) {
				ans += temp;
			}
		}
		
		System.out.print(ans);
	}

}