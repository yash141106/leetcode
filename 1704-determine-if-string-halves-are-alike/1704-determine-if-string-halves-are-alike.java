class Solution {
    public boolean halvesAreAlike(String s) {
        int n = s.length()/2;
        String a = s.substring(0,n);
        String b = s.substring(n);
        int i=0;
        int count1=0;
        int count2=0;
        String v = "aeiouAEIOU";
        while(i <n){
            if(v.indexOf(a.charAt(i)) != -1){
                count1++;
                i++;
            }
            else{
                i++;
            }
        }
        int j=0;
        while(j <n){
            if(v.indexOf(b.charAt(j)) != -1){
                count2++;
                j++;
            }
            else{
                j++;
            }
        }
        if(count1==count2){
            return true;
        }
        else{
            return false;
        }
    }
}