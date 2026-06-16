class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> ans=new HashSet<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char boards=board[i][j];
                if(boards!='.'){
                    if(!ans.add(boards+"row"+i)||!ans.add(boards+"col"+j)||!ans.add(boards+"board"+j/3+i/3)) return false;
                }
            }
        }
        return true;
    }

}