import java.io.*;

public class P10480 {
	
	static int N;
	static StringBuilder sb = new StringBuilder();
	
	public static void check(int temp) {
		if(Math.abs(temp) % 2 == 0) {
			sb.append(temp +" is even"+"\n");
		}else {
			sb.append(temp + " is odd"+"\n");
		}
	}
	
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        
        N = Integer.parseInt(br.readLine());
        for(int i=0 ; i<N ; i++) {
        	int temp = Integer.parseInt(br.readLine());
        	check(temp);
        }
        br.close();    
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}