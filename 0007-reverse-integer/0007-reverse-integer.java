class Solution {
    public int reverse(int x) {
        int num=x;
        int sum=0;
        int n;
        if(num==0){
            return 0;
        }
        if(num>0){
            while(num>0){
                n=num%10;
                num=num/10;
                if (sum > Integer.MAX_VALUE / 10 || (sum == Integer.MAX_VALUE / 10 && n > 7))
                return 0;
                sum=sum*10+n;
            }
            return sum;
        }
        else{
            num=num*(-1);
            while(num>0){
                n=num%10;
                num=num/10;
                if (sum > Integer.MAX_VALUE / 10 || (sum == Integer.MAX_VALUE / 10 && n > 7)) 
                return 0;
                sum=sum*10+n;
            }
            sum=sum*(-1);
            return sum;
        }
    }
}