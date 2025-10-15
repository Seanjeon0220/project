import java.io.*;
import java.util.*;

public class P5928 {
	
	static int d1, h1, m1, d2, h2, m2, total = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		d1 = Integer.parseInt(st.nextToken());
		h1 = Integer.parseInt(st.nextToken());
		m1 = Integer.parseInt(st.nextToken());
		br.close();
		
		if(d1 < 11) {
			sb.append(-1);
		}else if(d1 == 11) {
			if(h1 < 11) {
				sb.append(-1);
			}else if(h1 == 11) {
				if(m1 >= 11) {
					total += m1 - 11;
					sb.append(total);
				}else {
					sb.append(-1);
				}
			}else if(h1 > 11) {
				if(m1 >= 11) {
					total += (h1 - 11) * 60 + m1 - 11;
					sb.append(total);
				}else {
					total += (h1 - 12) * 60 + 60 - 11 + m1;
					sb.append(total);
				}
			}
		}else if(d1 > 11) {
			if(h1 > 11) {
				if(m1 >= 11) {
					total += (d1 - 11) * 24 * 60 + (h1 - 11) * 60 + m1 - 11;
					sb.append(total);
				}else if(m1 < 11) {
					total += (d1 - 11) * 24 * 60 + (h1 - 12) * 60 + 60 - 11 + m1;
					sb.append(total);
				}
			}else if(h1 == 11) {
				if(m1 >= 11) {
					total += (d1 - 11) * 24 * 60 + m1 - 11;
					sb.append(total);
				}else if(m1 < 11) {
					total += (d1 - 12) * 24 * 60 + 23 * 60 + 60 - 11 + m1;
					sb.append(total);
				}
			}else if(h1 < 11) {
				if(m1 >= 11) {
					total += (d1 - 12) * 24 * 60 + (24 - 11 + h1) * 60 + m1 - 11;
					sb.append(total);
				}else if(m1 < 11) {
					total += (d1 - 12) * 24 * 60 + (24 - 12 + h1) * 60 + 60 - 11 + m1;
					sb.append(total);
				}
			}
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
