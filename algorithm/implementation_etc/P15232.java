import java.io.*;

public class P15232{
	
	static int N, M;
	
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
    	
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        br.close();
        
        for(int i=0 ; i<N ; i++) {
        	for (int j=0 ; j<M ; j++) {
        		sb.append("*");
        	}
        	sb.append("\n");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}