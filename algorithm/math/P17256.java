import java.io.*;

public class P17256 {
	
	static int first, second, third;
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        String al[] = br.readLine().split(" ");
        String cl[] = br.readLine().split(" ");
        
        first = Integer.parseInt(cl[0]) - Integer.parseInt(al[2]);
        second = Integer.parseInt(cl[1]) / Integer.parseInt(al[1]);
        third = Integer.parseInt(cl[2]) - Integer.parseInt(al[0]);
        
        
        sb.append(first +" "+ second +" "+third);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}