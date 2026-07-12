import java.io.*;
import java.util.*;

public class P7662 {
    
    static int removeMap(PriorityQueue<Integer> que, Map<Integer, Integer> map) {
        int num;
        while (true) {
            num = que.poll();
            int cnt = map.getOrDefault(num, 0);

            if (cnt == 0)
                continue;

            if (cnt == 1)
                map.remove(num);
            else
                map.put(num, cnt - 1);

            break;
        }

        return num;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            int k = Integer.parseInt(br.readLine());
            Map<Integer, Integer> map = new HashMap<>();
            PriorityQueue<Integer> minQue = new PriorityQueue<>();
            PriorityQueue<Integer> maxQue = new PriorityQueue<>(Collections.reverseOrder());

            for (int i = 0; i < k; i++) {
                String[] input = br.readLine().split(" ");
                char ch = input[0].charAt(0);
                int n = Integer.parseInt(input[1]);

                if (ch == 'I') {
                    map.put(n, map.getOrDefault(n, 0) + 1);

                    minQue.add(n);
                    maxQue.add(n);
                } else {
                    if (map.size() == 0)
                        continue;

                    PriorityQueue<Integer> que = n == 1 ? maxQue : minQue;
                    removeMap(que, map);
                }
            }

            StringBuilder sb = new StringBuilder();
            if (map.size() == 0)
                sb.append("EMPTY");
            else {
                int n = removeMap(maxQue, map);
                sb.append(n).append(" ");
                if (map.size() > 0)
                    sb.append(removeMap(minQue, map));
                else
                    sb.append(n);
            }
            bw.write(sb.toString());
            bw.newLine();
            bw.flush();
        }

        bw.close();
        br.close();
    }
}
