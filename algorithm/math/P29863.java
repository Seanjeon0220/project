import java.io.*;

public class P29863{
	
	static int N, M, ans;
	
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        br.close();
        
        if(N>=20 && N<=23) {
        	ans = 24+M-N;
        }else{
        	ans = M-N;
        }
        

        sb.append(ans);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        
    }

}