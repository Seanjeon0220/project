import java.io.*;

public class P1259 {
	
	static boolean is_palindrome(String s)
	{
		int n=s.length();
		for(int i=0, j=n-1; i<=j; i++, j--)
			if (s.charAt(i)!=s.charAt(j))
				return false;
		return true;
	}
	
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb=new StringBuilder();
		
		while(true) {
			String s=br.readLine();
			if (s.equals ("0"))
				break;
			if(is_palindrome(s))
				sb.append("yes\n");
			else
				sb.append("no\n");
		}
		
		
		bw.write(sb.toString());
		bw.close();
		br.close();
        
	}

}
