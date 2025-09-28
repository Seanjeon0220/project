import java.util.Scanner;

public class P2753 {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int n = sc.nextInt();
		int count = 0;
		
		if (n%4==0 && n%100!=0){
			count = 1;
		}else if (n%400==0) {
			count = 1;
		}
		
		System.out.print(count);

        sc.close();
		
		
	}

}
