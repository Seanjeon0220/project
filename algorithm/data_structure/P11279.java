import java.io.*;
import java.util.*;

public class P11279 {
	
	static class PriorityQueue {

        private final List<Integer> data;

        PriorityQueue() {
            data = new ArrayList<>();
        }

        public void add(Integer item) {
            data.add(item);
            int child = data.size() - 1;
            while (child > 0) {
                int parent = (child - 1) / 2;
                if (data.get(child) <= data.get(parent)) {
                    break;
                }
                Collections.swap(data, child, parent);
                child = parent;
            }
        }

        public Integer poll() {
            if (data.isEmpty()) {
                return 0;
            }
            Collections.swap(data, 0, data.size() - 1);
            Integer item = data.remove(data.size() - 1);

            int parent = 0;
            while (true) {
                int leftChild = parent * 2 + 1;
                if (leftChild >= data.size()) {
                    break;
                }
                int rightChild = leftChild + 1;
                int maxChild = leftChild;
                if (rightChild < data.size() && data.get(rightChild) > data.get(leftChild)) {
                    maxChild = rightChild;
                }
                if (data.get(parent) >= data.get(maxChild)) {
                    break;
                }
                Collections.swap(data, parent, maxChild);
                parent = maxChild;
            }
            return item;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());

        PriorityQueue pq = new PriorityQueue();

        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(br.readLine());

            if (x == 0) {
                sb.append(pq.poll()+"\n");
            } else {
                pq.add(x);
            }
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    
}