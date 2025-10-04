import java.io.*;

public class P23235 {
	
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
         
        int idx = 1;

        while(true) {
        	String temp = br.readLine();
        	if(temp.equals(("0"))){
        		break;
        	}else {
        		sb.append("Case " + idx + ": Sorting... done!" +"\n");
        		idx++;
        	}
        }
        br.close();
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        
    }

}