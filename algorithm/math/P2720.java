import java.io.*;

public class P2720 {
	
	static int N;
	static StringBuilder sb = new StringBuilder();
	
	public static void comp(int a) {
		int A,B,C,D;
		A = a/25;
		B = (a-A*25)/10;
		C = (a-A*25-B*10)/5;
		D = a - A*25 - B*10 - C*5;
		
		sb.append(A + " "+B+" "+C+" "+D+"\n");
		return;
		
	}
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        

        N = Integer.parseInt(br.readLine());
        
        for(int i=0; i<N ; i++) {
        	int a = Integer.parseInt(br.readLine());
        	comp(a);
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}