class Solution {
    public int mySqrt(int x) {
        if(x<0){
            return 0;
        }else{
            int low=(int) Math.floor(Math.sqrt(x));
            return low;
            }
    }
}