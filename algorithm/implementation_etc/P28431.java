import java.io.*;

public class P28431 {
	
	static int[] total = new int[10];
	
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	StringBuilder sb = new StringBuilder();
    	
    
    	for(int i=0 ; i<5 ; i++) {
    		int temp = Integer.parseInt(br.readLine());
    		total[temp]++;
    	}
    	br.close();
    	
    	for(int j=0 ; j<11 ; j++) {
    		int check = total[j];
    		if(check % 2 !=0) {
    			sb.append(j);
    			break;
    		}
    	}
    	
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}


