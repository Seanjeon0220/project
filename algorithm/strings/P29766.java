import java.io.*;

public class P29766 {
	
	static String word;
	static int ans = 0;
	
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	StringBuilder sb = new StringBuilder();

    	word = br.readLine();
    	br.close();
    	
    	String total[] = new String[word.length()-3];
    	
    	for(int i=0 ; i<total.length ; i++) {
    		String temp = word.substring(i, i+4);
    		if(temp.equals("DKSH")) {
    			ans++;
    		}
    	}
    	
    	sb.append(ans);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}