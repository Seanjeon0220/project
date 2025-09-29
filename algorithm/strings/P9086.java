import java.util.*;

public class P9086 {	
    
    static int N;
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        N = sc.nextInt();;
        
        for (int i=0 ; i<N ; i++) {
        	String word = sc.next();
        	String ans = function(word);
        	System.out.println(ans);
        }
        
        sc.close();
    }
	
	static String function(String word) {
		int len = word.length();
		char a = word.charAt(0);
		char b = word.charAt(len-1);
		String ans = Character.toString(a)+Character.toString(b);
		return ans;
	}
	
}