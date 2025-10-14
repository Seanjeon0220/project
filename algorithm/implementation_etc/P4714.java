import java.io.*;

public class P4714 {
	public static void main(String[] args) throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			double temp = Double.parseDouble(br.readLine());
			if(temp < 0) {
				break;
			}else {
				double wm = temp*0.167;
				System.out.printf("Objects weighing %.2f on Earth will weigh %.2f on the moon.\n", temp, wm);
			}
		}
		
	}
}
