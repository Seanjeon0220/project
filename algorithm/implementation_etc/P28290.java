import java.io.*;

public class P28290{
	
	static String word;
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        word = br.readLine();
        br.close();
        
        if(word.equals("fdsajkl;")|| word.equals("jkl;fdsa")) {
        	sb.append("in-out");
        }else if(word.equals("asdf;lkj" ) || word.equals(";lkjasdf")) {
        	sb.append("out-in");
        }else if(word.equals("asdfjkl;")) {
        	sb.append("stairs");
        }else if(word.equals(";lkjfdsa")){
        	sb.append("reverse");
        }else {
        	sb.append("molu");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}