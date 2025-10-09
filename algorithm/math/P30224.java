import java.io.*;

public class P30224 {
	
	static int num;
	static String temp; 
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		temp = br.readLine();
		br.close();
		
		boolean check = false;;
		
		for(int i=0 ; i<temp.length(); i++) {
			if(temp.charAt(i) == '7') {
				check = true;
				break;
			}
		}
		
		if(check) {
			if(Integer.parseInt(temp)%7==0) {
				sb.append(3);
			}else {
				sb.append(2);
			}
		}else {
			if(Integer.parseInt(temp)%7 == 0) {
				sb.append(1);
			}else {
				sb.append(0);
			}
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
