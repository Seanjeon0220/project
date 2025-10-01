import java.io.*;

public class P11654 {	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        char a = br.readLine().charAt(0);
        int num = (int)a;
        sb.append(num);
        
        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}