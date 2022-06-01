public class Solution {
    public int romanToInt(String s) {
        char[] ch = s.toCharArray();
        int[] in = new int[ch.length];
        int sum=0;
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='M') in[i]=1000;
            else if(ch[i]=='D') in[i]=500;
            else if(ch[i]=='C') in[i]=100;
            else if(ch[i]=='L') in[i]=50;
            else if(ch[i]=='X') in[i]=10;
            else if(ch[i]=='V') in[i]=5;
            else if(ch[i]=='I') in[i]=1;
        }
        for(int i=0;i<in.length;i++){
            if(i!=in.length-1&&in[i]<in[i+1])
                in[i] = -in[i];
            sum += in[i];
        }
        return sum;
    }
}