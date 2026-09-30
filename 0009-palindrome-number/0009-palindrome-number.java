class Solution {
    public boolean isPalindrome(int x) {
        boolean pali;
        int z=x;
        int q;
        int num=0;
        while(z>=1){
            q=z%10;
            z=z/10;
            num=num*10+q;
        }
        if(num==x){
            pali = true;
        }
        else{
            pali = false;
        }
        return pali;
    }
}