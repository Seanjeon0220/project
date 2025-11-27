import java.io.*;
import java.util.*;

public class P2149 {
	
	public static void main(String[] args) throws IOException{
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb=new StringBuilder();
        
        String key = br.readLine();
        int _ = key.length();
        String password = br.readLine();
        int _ = password.length();
        int line = password.length() / key.length();

        HashMap<Integer, Character> sequence = new HashMap<>();

        for (int i = 0; i < key.length(); i++) {
            sequence.put(i, key.charAt(i));
        }
        
        List<Map.Entry<Integer, Character>> list = new ArrayList<>(sequence.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<Integer, Character>>() {
            public int compare(Map.Entry<Integer, Character> o1, Map.Entry<Integer, Character> o2) {
                return Character.compare(o1.getValue(), o2.getValue());
            }
        });

        LinkedHashMap<Integer, Character> sortedSequence = new LinkedHashMap<>();
        for (Map.Entry<Integer, Character> entry : list) {
            sortedSequence.put(entry.getKey(), entry.getValue());
        }

        List<Integer> keySets = new ArrayList<>(sortedSequence.keySet());

        HashMap<Integer, String> amo = new HashMap<>();



        int idx = 0;
        for(int i = 0; i < key.length(); i++){
            int ac = keySets.get(i);
            String subString = password.substring(idx * line, line * (idx + 1));

            amo.put(ac, subString);
            idx++;
        }

        Collections.sort(keySets);


        int maxLength = amo.values().stream().mapToInt(String::length).max().orElse(0);

        for (int i = 0; i < maxLength; i++) {
            for (Integer ac : amo.keySet()) {
                String value = amo.get(ac);
                if (i < value.length()) {
                    bw.write(value.charAt(i));
                }
            }
        }
        
        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}