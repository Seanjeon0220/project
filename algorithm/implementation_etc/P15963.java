import java.util.*;
import java.math.*;

public class P15963 {
	
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        BigInteger N = sc.nextBigInteger() ;
        BigInteger M = sc.nextBigInteger() ;
        
        if(N.equals(M)) {
        	System.out.print(1);
        }else {
        	System.out.print(0);
        }
        
        sc.close();
    }

}