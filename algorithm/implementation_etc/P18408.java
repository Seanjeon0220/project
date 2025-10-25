import java.io.*;

public class P18408 {

	static int one = 0, two = 0;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		String temp[] = br.readLine().split(" ");
		br.close();
		
		for(int i=0 ; i<3 ; i++) {
			if(Integer.parseInt(temp[i]) == 1) {
				one++;
			}else {
				two++;
			}
		}
		
		if(one > two) {
			sb.append(1);
		}else {
			sb.append(2);
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}

}