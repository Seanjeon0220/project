import java.io.*;
 
public class P6778 {
	
	static int A, E;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        A = Integer.parseInt(br.readLine());
        E = Integer.parseInt(br.readLine());
        br.close();
        
        if(A>=3 && E<=4) {
        	sb.append("TroyMartian"+"\n");
        }
    	
        if(A<=6 && E>=2) {
        	sb.append("VladSaturnian"+"\n");
        }
        
        if(A<=2 && E<=3) {
        	sb.append("GraemeMercurian"+"\n");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
