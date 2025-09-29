import java.io.*;

public class P8545 {
	
	static String word;
	
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
    	
        word = br.readLine();
        br.close();
        String ans = "";
        
        for(int i=word.length()-1 ; i>=0 ; i--) {
        	ans += word.substring(i, i+1);
        }
        
        sb.append(ans);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}