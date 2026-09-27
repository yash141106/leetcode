class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int top=0;
        int bottom=m-1;
        int left=0;
        int right=n-1;
        List<Integer> result = new ArrayList<>();
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                result.add(matrix[top][i]);
            }
            top++;
            for(int j=top;j<=bottom;j++){
                result.add(matrix[j][right]);
            }
            right--;
            if(top<=bottom){
                for(int k =right;k>=left;k--){
                    result.add(matrix[bottom][k]);
                }
                bottom--;
            }
            if(left<=right){
                for(int l=bottom;l>=top;l--){
                    result.add(matrix[l][left]);
                }
                left++;
            }
        }
        return result;
    }
}