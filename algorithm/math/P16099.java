import java.util.*;
import java.math.*;

public class P16099 {
	
	static int N;
	
	public static String check(BigInteger it, BigInteger wt, BigInteger ie, BigInteger we) {
		BigInteger t = it.multiply(wt);
		BigInteger e = ie.multiply(we);
		
		if(t.compareTo(e) > 0) {
			return "TelecomParisTech";
		}else if(t.compareTo(e) < 0){
			return "Eurecom";
		}else {
			return "Tie";
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		
		for(int i=0 ; i<N ; i++) {
			BigInteger it = sc.nextBigInteger();
			BigInteger wt = sc.nextBigInteger();
			BigInteger ie = sc.nextBigInteger();
			BigInteger we = sc.nextBigInteger();
			
			String ans = check(it,wt,ie,we);
			System.out.println(ans);
		}
		
		sc.close();
		
	}
}
