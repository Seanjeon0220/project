import java.io.*;

public class P15000 {
	
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
    	
        String temp = br.readLine();
        br.close();
        
        sb.append(temp.toUpperCase());
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}