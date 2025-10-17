import java.io.*;

public class P9295 {
	
	static int N;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        N = Integer.parseInt(br.readLine());
        
        for(int i=1 ; i<=N; i++) {
        	String[] total = br.readLine().split(" ");
        	int a = Integer.parseInt(total[0]);
        	int b = Integer.parseInt(total[1]);
        	int sum = a+b;
        	sb.append("Case " + i + ": " + sum +"\n");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        
    	
	}

}
