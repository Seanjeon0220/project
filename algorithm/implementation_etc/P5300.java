import java.io.*;

public class P5300 {
	
	static int N;
	
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	StringBuilder sb = new StringBuilder();
    	
        N = Integer.parseInt(br.readLine());
        br.close();
        
        for(int i=0;i<N;i++){
            sb.append(i+1 +" ");
            if((i+1)%6==0 || i==N-1){
                sb.append("Go! ");
            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
