import java.io.*;

public class P32314{
	
	static int a, w, v;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		a = Integer.parseInt(br.readLine());
		String[] temp = br.readLine().split(" ");
		w = Integer.parseInt(temp[0]);
		v = Integer.parseInt(temp[1]);
		br.close();
		
		int check = w/v;
		
		if(a > check) {
			sb.append(0);
		}else {
			sb.append(1);
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}

}
