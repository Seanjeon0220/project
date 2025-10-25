import java.io.*;

public class P18398 {
		
	static int T;
	
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	StringBuilder sb = new StringBuilder();
    	
    	T= Integer.parseInt(br.readLine());
    	for(int i=0 ; i<T ; i++) {
    		int N = Integer.parseInt(br.readLine());
    		for(int j=0 ; j<N ; j++) {
    			String total[] = br.readLine().split(" ");
    			int a = Integer.parseInt(total[0]);
    			int b = Integer.parseInt(total[1]);
    			sb.append(a+b + " " + a * b+"\n");
    		}
    	}
        br.close();
        
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}

