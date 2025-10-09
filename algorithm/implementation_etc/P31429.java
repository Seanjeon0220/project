import java.io.*;

public class P31429{
	
	static int N;
	
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        N = Integer.parseInt(br.readLine());
        br.close();
      
        if(N==1) {
        	sb.append("12 1600");
        }else if(N==2) {
        	sb.append("11 894");
        }else if(N==3) {
        	sb.append("11 1327");
        }else if(N==4) {
        	sb.append("10 1311");
        }else if(N==5) {
        	sb.append("9 1004");
        }else if(N==6) {
        	sb.append("9 1178");
        }else if(N==7) {
        	sb.append("9 1357");
        }else if(N==8) {
        	sb.append("8 837");
        }else if(N==9) {
        	sb.append("7 1055");
        }else if(N==10) {
        	sb.append("6 556");
        }else {
        	sb.append("6 773");
        }
        
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        
    }

}