class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList <>();
        int maxcandy =0;
        for(int i = 0;i<candies.length;i++){
            maxcandy = Math.max(maxcandy,candies[i]);
        }
        for(int j =0;j<candies.length;j++){
            if(candies[j]+extraCandies>=maxcandy){
                result.add(true);
            }
            else{
                result.add(false);
            }
        }
        return result;
    }
}