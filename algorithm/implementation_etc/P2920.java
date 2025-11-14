import java.io.*;
 
public class P2920 {
	
	public static String check(int[] ascend, int[] descend, int[] total) {
		boolean checkA = true;
		boolean checkD = true;
		
		for(int i=0 ; i<8 ; i++) {
			if(ascend[i] != total[i]) {
				checkA = false;
				break;
			}
		}
		
		for(int i=0 ; i<8 ; i++) {
			if(descend[i] != total[i]) {
				checkD = false;
				break;
			}
		}
		
		if(checkA) {
			return "ascending";
		}else if(checkD) {
			return "descending";
		}else {
			return "mixed";
		}
	}
  
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		String[] temp = br.readLine().split(" ");
		int[] total = new int[8];
		
		for(int i=0 ; i<8 ; i++) {
			total[i] = Integer.parseInt(temp[i]);
		}
		int[] ascend = {1,2,3,4,5,6,7,8};
		int[] descend = {8,7,6,5,4,3,2,1};
		
		String ans = check(ascend, descend, total);
		
		sb.append(ans);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
 
	}
 
	
}