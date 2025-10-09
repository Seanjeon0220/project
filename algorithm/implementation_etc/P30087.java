import java.io.*;

public class P30087 {
	
	static int N;
	static StringBuilder sb = new StringBuilder();
	
	public static void check(String word) {
		if(word.equals("Algorithm")) {
			sb.append("204"+"\n");
		}else if(word.equals("DataAnalysis")) {
			sb.append("207"+"\n");
		}else if(word.equals("ArtificialIntelligence")) {
			sb.append("302"+"\n");
		}else if(word.equals("CyberSecurity")) {
			sb.append("B101"+"\n");
		}else if(word.equals("Network")) {
			sb.append("303"+"\n");
		}else if(word.equals("Startup")) {
			sb.append("501"+"\n");
		}else {
			sb.append("105"+"\n");
		}
	}
	
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
    	
        N = Integer.parseInt(br.readLine());
        
        for(int i=0 ; i<N ; i++) {
        	String temp = br.readLine();
        	check(temp);
;        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

}