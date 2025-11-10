import java.io.*;

public class P3009 {
	
	public static int Check(int[] arr) {
		
		if (arr[0] == arr[1]) {
			return arr[2];
		}else if(arr[0] == arr[2]) {
			return arr[1];
		}else {
			return arr[0];
		}
	}
	
	static int x[], y[], ansX, ansY;
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        x = new int[3];
        y = new int[3];
        
        for (int i=0 ; i<3; i++) {
        	String[] total = br.readLine().split(" ");
        	x[i] = Integer.parseInt(total[0]);
        	y[i] = Integer.parseInt(total[1]);
        }
        
        ansX = Check(x);
        ansY = Check(y);
        
        sb.append(ansX +" "+ansY);
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
        
    }

}