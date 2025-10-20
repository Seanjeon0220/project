import java.io.*;
 
public class P11365 {
	
	public static String check(String s) {
		String ans = "";
		for(int i=s.length()-1 ; i>=0 ; i--) {
			ans += s.substring(i,i+1);
		}
		return ans;
	}

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        while(true) {
        	String sentence = br.readLine();
        	if(sentence.equals("END")) {
        		break;
        	}else {
        		sb.append(check(sentence)+"\n");
        	}
        }
        br.close();
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
