import java.io.*;

public class P21598 {
	
	static int N;
	
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
    	
        N = Integer.parseInt(br.readLine());
        br.close();
        
        if(N==1) {
        	sb.append("SciComLove");
        }else {
        	sb.append("SciComLove"+"\n");
        	sb.append("SciComLove");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}