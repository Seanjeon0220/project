import java.util.*;

public class P26209{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean check = true;
		
		for(int i=0 ; i<8; i++) {
			int temp = sc.nextInt();
			if(temp == 9) {
				check = false;
				break;
			}
		}
		
		if(check == true) {
			System.out.print("S");
		}else {
			System.out.print("F");
		}
		sc.close();
	}
}
