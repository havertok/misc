//solution to check a sudoku board (not solve) empty spaces are '.' in case you were wondering why I have that check
//Time is basically n (slightly more since rows AND squared have to be checked so each entry gets checked twice)
//space is also twice N I believe, since, though the Sets will only contain max 9 char, they are made for every row/col/square.

class Solution {
    
    public boolean isValidSudoku(char[][] board) {
        
        //check row/col first
        for(int i = 0; i < 9; i++){
            if(!checkVertical(board, i)){
                return false;
            }
            if(!checkHorizontal(board, i)){
                return false;
            }
        }
        
        for(int i = 0; i < 9; i+=3){
            for(int j = 0; j < 9; j+=3){
                if(!checkSquare(board, i, j)){
                    return false;
                }
            }
        }
        return true;
    }
    
    //where x, y is the position of the top left pos of the square to check
    public boolean checkSquare(char[][] board, int x, int y){
        Set<Character> currNums = new HashSet<Character>();
        
        //System.out.println("checking square at: " + x + ", "+ y + "\n\r");
        
        for(int i = x; i < (x+3); i++){
            for(int j = y; j < (y+3); j++){
                //System.out.print(board[i][j]);
                if(board[i][j] == '.'){
                    //really just here so that the set check only occurs on non '.' chars
                }
                else if(!currNums.add(board[i][j])){
                    return false;
                }
            }
        }
        return true;
    }
    
    public boolean checkVertical(char[][] board, int column){
        Set<Character> currNums = new HashSet<Character>();
        for(int i = 0; i < 9; i++){
            if(board[column][i] == '.'){
                    
            }
            else if(!currNums.add(board[column][i])){
                return false;
            }
        }
        return true;
    }
    
    public boolean checkHorizontal(char[][] board, int row){
        Set<Character> currNums = new HashSet<Character>();
        for(int i = 0; i < 9; i++){
            if(board[i][row] == '.'){
                    
                }
            else if(!currNums.add(board[i][row])){
                return false;
            }
        }
        return true;
    }
    
}