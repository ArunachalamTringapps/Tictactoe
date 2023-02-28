package org.example;


import java.util.Scanner;

class HumanPlayer
{
    String name;
    char mark;
    HumanPlayer(String name,char mark){
        this.name=name;
        this.mark=mark;
    }

    void makeMove()
    {
        Scanner scan=new Scanner(System.in);
        int row;
        int col;
        do
        {
            Tictactae.l.println("enter row and col:");
            row=scan.nextInt();
            col=scan.nextInt();
        }while(!validMove(row,col));
        Tictactae.placeMark(row,col,mark);
    }
    boolean validMove(int row,int col)
    {
        return row>=0 && row<=2 && col>=0 && col<=2 && Tictactae.board[row][col]==' ';

    }
}