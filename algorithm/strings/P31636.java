import java.io.*;

public class P31636 {
	
	static int N;
	static String word;
	static boolean check;
	
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        N = Integer.parseInt(br.readLine());
        word = br.readLine();
        br.close();
        
        check = false;
        for(int i=0 ; i<word.length()-2 ; i++) {
        	String temp = word.substring(i, i+3);
        	if(temp.equals("ooo")) {
        		check = true;
        		break;
        	}
        }
        	
        if(check) {
        	sb.append("Yes");
        }else {
        	sb.append("No");
        }
        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}
