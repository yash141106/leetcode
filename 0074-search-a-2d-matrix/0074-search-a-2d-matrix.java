class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        return search(matrix,target);
    }
    boolean binarysearch(int[][] matrix,int row,int cs,int ce,int target){
        while(cs<=ce){
            int m = cs+(ce-cs)/2;
            if(matrix[row][m]==target){
                return true;
            }
            else if(matrix[row][m]>target){
                ce=m-1;
            }
            else{
                cs=m+1;
            }
        }
        return false;
    }
    boolean search(int[][] matrix,int target){
        int rows = matrix.length;
        int cols = matrix[0].length;

        if(rows==1){
            return binarysearch(matrix,0,0,cols-1,target);
        }
        int rs=0;
        int re=rows-1;
        int midcol = cols/2;
        while(rs<(re-1)){
            int m = rs+(re-rs)/2;
            if(matrix[m][midcol]==target){
                return true;
            }
            else if(matrix[m][midcol]<target){
                rs=m;
            }
            else{
                re=m;
            }
        }
        if(matrix[rs][midcol]==target){
            return true;
        }
        if(matrix[rs+1][midcol]==target){
            return true;
        }
                if(target < matrix[rs][midcol]){
            return binarysearch(matrix, rs, 0, midcol-1, target);
        }
        else if(target <= matrix[rs][cols-1]){
            return binarysearch(matrix, rs, midcol+1, cols-1, target);
        }
        else if(target < matrix[rs+1][midcol]){
            return binarysearch(matrix, rs+1, 0, midcol-1, target);
        }
        else{
            return binarysearch(matrix, rs+1, midcol+1, cols-1, target);
        }
    }
}