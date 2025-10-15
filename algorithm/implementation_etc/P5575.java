import java.io.*;

public class P5575 {
	
	static StringBuilder sb = new StringBuilder();
	
	public static void time(int a, int b, int c, int d, int e, int f) {
		int start = a*3600 + b*60 + c;
		int end = d*3600 + e*60 + f;
		int value = end - start;
		
		int h = value / 3600;
		int m = (value - h*3600) / 60;
		int s = value%60;
		
		sb.append(h + " "+ m + " "+ s+"\n");
		
	}
	
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
    	
    	for(int i=0 ; i<3 ; i++) {
    		String total[] = br.readLine().split(" ");
    		int a = Integer.parseInt(total[0]);
    		int b = Integer.parseInt(total[1]);
    		int c = Integer.parseInt(total[2]);
    		int d = Integer.parseInt(total[3]);
    		int e = Integer.parseInt(total[4]);
    		int f = Integer.parseInt(total[5]);
    		
    		time(a,b,c,d,e,f);
    		
    	}
    	
    	
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}