
import java.io.*;
import java.util.*;


public class P1978 {

		static boolean is_prime(int n)
		{
			if (n==1)
				return false;
			for(int i=2; i*i<=n; i++)
				if (n%i==0)
					return false;
			return true;
		}
		
		
		public static void main(String[] args) throws IOException
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
			StringBuilder sb=new StringBuilder();
			StringTokenizer st;

			int n=Integer.parseInt(br.readLine());
			st=new StringTokenizer(br.readLine());
			int ans=0;
			for (int i=0;i<n;i++)
			{
				int m=Integer.parseInt(st.nextToken());
				if(is_prime(m))
					ans++;
			}
			sb.append(ans);
			
			bw.write(sb.toString());
			bw.close();
			br.close();
	
	}

}
