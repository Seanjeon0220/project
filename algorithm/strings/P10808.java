import java.io.*;
 
public class P10808 {
	
	static int total[] = new int[26];

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        String word = br.readLine();
        br.close();
        
        for(int i=0 ; i<word.length() ; i++) {
        	char c = word.charAt(i);
        	if(c == 'a') {
        		total[0]++;
        	}else if(c == 'b') {
        		total[1]++;
        	}else if(c == 'c') {
        		total[2]++;
        	}else if(c == 'd') {
        		total[3]++;
        	}else if(c == 'e') {
        		total[4]++;
        	}else if(c == 'f') {
        		total[5]++;
        	}else if(c == 'g') {
        		total[6]++;
        	}else if(c == 'h') {
        		total[7]++;
        	}else if(c == 'i') {
        		total[8]++;
        	}else if(c == 'j') {
        		total[9]++;
        	}else if(c == 'k') {
        		total[10]++;
        	}else if(c == 'l') {
        		total[11]++;
        	}else if(c == 'm') {
        		total[12]++;
        	}else if(c == 'n') {
        		total[13]++;
        	}else if(c == 'o') {
        		total[14]++;
        	}else if(c == 'p') {
        		total[15]++;
        	}else if(c == 'q') {
        		total[16]++;
        	}else if(c == 'r') {
        		total[17]++;
        	}else if(c == 's') {
        		total[18]++;
        	}else if(c == 't') {
        		total[19]++;
        	}else if(c == 'u') {
        		total[20]++;
        	}else if(c == 'v') {
        		total[21]++;
        	}else if(c == 'w') {
        		total[22]++;
        	}else if(c == 'x') {
        		total[23]++;
        	}else if(c == 'y') {
        		total[24]++;
        	}
        	else {
        		total[25]++;
        	}
        }
        
        for(int i=0 ; i<26 ; i++) {
        	sb.append(total[i]+" ");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
