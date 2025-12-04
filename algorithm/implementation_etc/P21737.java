import java.io.*;
import java.util.*;

public class P21737 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb=new StringBuilder();

        int _=Integer.parseInt(br.readLine());
        String s=br.readLine();
        Deque<Long> nums=new LinkedList<>();
        Deque<Character> op=new LinkedList<>();
        int l=s.length();
        boolean output=false;

        for(int start=0,end=1;end<l;end++)
        {
            char c=s.charAt(end);
            if(c=='S' || c=='M' || c=='U' || c=='P' || c=='C')
            {
                if(c=='C')
                    output=true;
                char pc=s.charAt(end-1);
                if(pc>='0' && pc<='9')
                    nums.add(Long.parseLong(s.substring(start,end)));
                op.add(c);
                start=end+1;
            }
        }

        if(!output)
        {
            System.out.println("NO OUTPUT");
            return;
        }
        Long num1,num2;
        for(char c : op)
        {
            if(c=='S' && nums.size()>1)
            {
                num1=nums.pollFirst();
                num2=nums.pollFirst();
                num1-=num2;
                nums.addFirst(num1);
            }
            else if(c=='M' && nums.size()>1)
            {
                num1=nums.pollFirst();
                num2=nums.pollFirst();
                num1*=num2;
                nums.addFirst(num1);
            }
            else if(c=='U' && nums.size()>1)
            {
                num1=nums.pollFirst();
                num2=nums.pollFirst();
                if(num1<0)
                {
                    num1=-num1;
                    num1/=num2;
                    num1=-num1;
                    nums.addFirst(num1);
                }
                else
                {
                    num1/=num2;
                    nums.addFirst(num1);
                }
            }
            else if(c=='P' && nums.size()>1)
            {
                num1=nums.pollFirst();
                num2=nums.pollFirst();
                num1+=num2;
                nums.addFirst(num1);
            }
            else if(c=='C' && !nums.isEmpty())
            {
                sb.append(nums.peekFirst()).append(" ");
            }
        }

        bw.write(sb.toString());
        bw.close();
        br.close();
    }
}