import java.util.Scanner;

public class P14681 {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int posx = sc.nextInt();
		int posy = sc.nextInt();
		int pos;
		
		if (posx*posy > 0) {
			if (posx > 0) {
				pos = 1;
			}else {
				pos = 3;
			}
		}else {
			if (posx > 0) {
				pos = 4;
			}else {
				pos = 2;
			}
		}
		
		System.out.print(pos);

        sc.close();
	}

}
