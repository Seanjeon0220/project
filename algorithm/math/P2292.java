import java.io.*;

public class P2292 {
	
	static int N;
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        N = Integer.parseInt(br.readLine()); 

        int room = 1;
        int findroom = 2;

        if(N == 1) {
            System.out.print(room);
        }else{
            while(findroom <= N) {
                findroom = findroom + (6 * room);
                room++;
            }
            sb.append(room);
        }
        
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
