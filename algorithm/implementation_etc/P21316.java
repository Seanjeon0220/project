import java.io.*;
import java.util.*;

@SuppressWarnings("unchecked")
public class P21316 {
	
	public static void main(String[] args) throws IOException{
		
		int[] numCheck = new int[13];
		ArrayList<Integer>[] end = new ArrayList[13];
        for (int i = 1; i < 13; i++) end[i] = new ArrayList<>();
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb=new StringBuilder();
        
        for (int i = 0; i < 12; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            numCheck[a]++;
            numCheck[b]++;
            end[a].add(b);
            end[b].add(a);
        }
        
        int spica = -1;
        for (int i = 1; i <= 12; i++) {
            if (numCheck[i] != 3) continue;

            int sum = 0;
            for (int adj : end[i]) sum += numCheck[adj];
            if (sum == 6) {
                spica = i;
                break;
            }
        }
        
        sb.append(spica);
        
        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}