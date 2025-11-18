import java.io.*;
import java.util.*;

public class P11005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken()); 
        int B = Integer.parseInt(st.nextToken()); 

        br.close();

        ArrayList<Character> list = new ArrayList<>();

        while (N > 0) { 
            if (N % B < 10) {
                list.add((char) (N % B + '0')); 
            }
            else{ 
                 
                
                list.add((char) (N % B - 10 + 'A')); 
            }
            N /= B;
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            sb.append(list.get(i));
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}