import java.io.*;

public class P31306{
	
	static int xcnt, ycnt, cnt;
	
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        String temp = br.readLine();
        br.close();
        xcnt = 0;
        ycnt = 0;
        
        for(int i=0 ; i<temp.length() ; i++) {
        	if(temp.charAt(i) == 'a' || temp.charAt(i) == 'A' || temp.charAt(i) == 'e' ||temp.charAt(i) == 'E' ||temp.charAt(i) == 'i' ||temp.charAt(i) == 'I' ||temp.charAt(i) == 'o' || temp.charAt(i) == 'O' ||temp.charAt(i) == 'u' ||temp.charAt(i) == 'U') {
    			xcnt++;
        	}else if(temp.charAt(i) == 'y') {
        		ycnt++;
        	}
		}
        
        cnt = xcnt+ycnt;
        sb.append(xcnt+ " " + cnt);
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}