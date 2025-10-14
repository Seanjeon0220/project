import java.io.*;
 
public class P4470 {
	
	static int N, num;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
    	N = Integer.parseInt(br.readLine());
    	for(int i=1 ; i<=N ; i++) {
    		String temp = br.readLine();
    		sb.append(i+ ". " + temp+"\n");
    	}
    	br.close();
    	
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
