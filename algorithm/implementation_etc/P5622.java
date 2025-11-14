import java.io.*;

public class P5622 {
    
	static String word;
	static int total;
		
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        word = br.readLine();
        int len = word.length();
        
        for (int i=0 ; i<len;i++) {
        	if (word.charAt(i) =='A' || word.charAt(i) =='B' || word.charAt(i) == 'C'){
        		total+=3;
        	}else if (word.charAt(i) =='D' || word.charAt(i) =='E' || word.charAt(i) == 'F'){
        		total+=4;
        	}else if (word.charAt(i) =='G' || word.charAt(i) =='H' || word.charAt(i) == 'I'){
        		total+=5;
        	}else if (word.charAt(i) =='J' || word.charAt(i) =='K' || word.charAt(i) == 'L'){
        		total+=6;
        	}else if (word.charAt(i) =='M' || word.charAt(i) =='N' || word.charAt(i) == 'O'){
        		total+=7;
        	}else if (word.charAt(i) =='P' || word.charAt(i) =='Q' || word.charAt(i) == 'R' || word.charAt(i) == 'S'){
        		total+=8;
        	}else if (word.charAt(i) =='T' || word.charAt(i) =='U' || word.charAt(i) == 'V'){
        		total+=9;
        	}else{
        		total+=10;
        	}
        }
        
        sb.append(total);
        
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }
}