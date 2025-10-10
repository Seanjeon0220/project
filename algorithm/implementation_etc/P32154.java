import java.io.*;

public class P32154 {
	
	static int N;

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		N = Integer.parseInt(br.readLine());
		br.close();
		
		if(N==1) {
			sb.append("11\n" + "A B C D E F G H J L M");
		}else if(N==2) {
			sb.append("9\n" + "A C E F G H I L M");
		}else if(N==3){
			sb.append("9\n" + "A C E F G H I L M");
		}else if(N==4) {
			sb.append("9\n" + "A B C E F G H L M");
		}else if(N!=10) {
			sb.append("8\n" + "A C E F G H L M");

		}else {
			sb.append("8\n" + "A B C F G H L M");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}

}
