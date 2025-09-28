import java.io.*;

public class P4101 {
	
	public static String check(int N, int M) {
		if(N>M) {
			return "Yes";
		}
		return "No";
	}
	
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();
    
    while(true) {
    	String total[] = br.readLine().split(" ");
    	int a = Integer.parseInt(total[0]);
    	int b = Integer.parseInt(total[1]);
    	
    	if(a==0) {
    		break;
    	}else {
    		sb.append(check(a,b)+"\n");
    	}
    }
    
    bw.write(sb.toString());
    br.close();
    bw.flush();
    bw.close();
  }
}