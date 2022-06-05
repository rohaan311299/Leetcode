class Solution {
    public boolean isPalindrome(int x) {
        int reverse = 0;
        int x_copy = x;
        if (x < 0) {
            return false;
        }
        while (x != 0) {
            int remainder = x % 10;
            reverse = reverse * 10 + remainder;
            x = x / 10;
        }

        if (reverse == x_copy) {
            return true;
        } else {
            return false;
        }
    }
}