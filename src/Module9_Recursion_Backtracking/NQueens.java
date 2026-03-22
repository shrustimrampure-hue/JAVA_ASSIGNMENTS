package Module9_Recursion_Backtracking;

import java.util.*;
public class NQueens {
    public static void main(String[] args) {
        int n=4;
        char[][] board=new char[n][n];
        for(char[] row:board)
            Arrays.fill(row,'.');
        solve(board,0);
    }
    static void solve(char[][] board,int row){
        if(row==board.length){
            for(char[] r:board)
                System.out.print(Arrays.toString(r));
            System.out.println();
            return;
        }
        for(int col=0;col<board.length;col++){
            if(valid(board,row,col)){
                board[row][col]='Q';
                solve(board,row+1);
                board[row][col]='.';
            }
        }
    }
    static boolean valid(char[][] board,int row,int col){
        for(int i=0;i<row;i++)
            if(board[i][col]=='Q') return false;
        return true;
    }
}