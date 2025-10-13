import java.io.*;

public class P1264 {
	
	static StringBuilder sb = new StringBuilder();
	
	public static void vowelcheck(String temp) {
		int cnt = 0;
		for(int i=0 ; i<temp.length() ;i++) {
			if(temp.charAt(i) == 'a' || temp.charAt(i) == 'A' || temp.charAt(i) == 'e' ||temp.charAt(i) == 'E' ||temp.charAt(i) == 'i' ||temp.charAt(i) == 'I' ||temp.charAt(i) == 'o' || temp.charAt(i) == 'O' ||temp.charAt(i) == 'u' ||temp.charAt(i) == 'U') {
				cnt++;
			}
		}
		sb.append(cnt+"\n");
	}
	
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        
        
    	while(true) {
    		String temp = br.readLine();
    		if(temp.equals("#")) {
    			break;
    		}else {
    			vowelcheck(temp);
    		}
    	}
    	
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}