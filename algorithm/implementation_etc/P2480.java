import java.util.Scanner;

public class P2480 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
 
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
 
        int prize = 0;
        
        if (A == B && A == C) {
        	prize = 10000 + A*1000;
        }else if (A == B && A != C) {
        	prize = 1000 + A*100;
        }else if (A == C && A != B) {
        	prize = 1000 + A*100;
        }else if (B == C && B != A) {
        	prize = 1000 + B*100;
        }else if (A != B && B != C && C != A){
        	int temp = Math.max(A,B);
        	temp = Math.max(temp, C);
        	prize = temp*100;
        }
        
        System.out.print(prize);

        sc.close();
    }
}
	
