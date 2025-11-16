import java.io.*;
import java.util.*;

public class P1546 {	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        
        int[] score = new int[N];
        st = new StringTokenizer(br.readLine());
        
        for (int i=0 ; i<N ; i++) {
        	score[i] = Integer.parseInt(st.nextToken());
        }
        
        int temp = 0;
        int sum = 0;
        
        for (int num : score) {
        	temp = Math.max(temp, num);
        	sum += num;
        }
        
        double result = (sum*100)/(double)(temp*N);
        
        sb.append(result);
        
        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}