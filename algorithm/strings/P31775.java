import java.io.*;

public class P31775 {
	
	static boolean kc = false, lc = false, pc = false;
	
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	StringBuilder sb = new StringBuilder();
    	
    	for(int i=0 ; i<3 ; i++) {
    		String temp = br.readLine();
    		char t = temp.charAt(0);
    		if(t == 'k') {
    			kc = true;
    		}else if(t == 'l') {
    			lc = true;
    		}else if(t == 'p') {
    			pc = true;
    		}else {
    			continue;
    		}
    	}
    	br.close();
    	
    	if(kc && lc && pc) {
    		sb.append("GLOBAL");
    	}else{
    		sb.append("PONIX");
    	}
    	
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}