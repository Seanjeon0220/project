import java.io.*;
 
public class P2530{
	
	static int h, m, s, p, hp, mp, sp;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
    	String total[] = br.readLine().split(" ");
    	p = Integer.parseInt(br.readLine());
    	br.close();
    	h = Integer.parseInt(total[0]);
    	m = Integer.parseInt(total[1]);
    	s = Integer.parseInt(total[2]);
    	
    	hp = p/3600;
    	mp = (p-3600*hp)/60;
    	sp = p%60;
    	
    	s +=sp;
    	m+= mp;
    	h+= hp;
    	
    	if(s>=60) {
    		s -= 60;
    		m++;
    	}
    	
    	if(m>=60) {
    		m-=60;
    		h++;
    	}
    	
    	if(h>=24) {
    		h = h%24;
    	}
    	
    	sb.append(h +" " + m + " "+ s);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
