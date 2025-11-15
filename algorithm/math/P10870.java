import java.io.*;

public class P10870 {
	
	static int N;
	
	static int fibonacci(int i){
        if(i<2)return i;

        return fibonacci(i-1)+fibonacci(i-2);
    }
    
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        N = Integer.parseInt(br.readLine());
        br.close();
        
        sb.append(fibonacci(N));
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    
}