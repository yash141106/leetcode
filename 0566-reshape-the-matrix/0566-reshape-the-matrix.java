class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int row=mat.length;
        int col=mat[0].length;
        int [][] shape = new int [r][c];
        if(row*col!=r*c){
            return mat;
        }
        ArrayList<Integer> go= new ArrayList<>();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                go.add(mat[i][j]);
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                shape[i][j]=go.get(i*c+j);
            }
        }
        return shape;
    }
}