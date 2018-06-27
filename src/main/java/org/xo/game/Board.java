package org.xo.game;

public class Board
{

    private int width;
    private int height;
    private Player[][] board;
    private Player currentPlayer;

    public Board (int width, int height){
        this.width  = width;
        this.height = height;
        board = new Player[width][height];
    }

    public void setPlayer(Address address, Player player) {
        this.board[address.getX()][address.getY()] = player;
    }

    public Player getPlayer(Address address) {
        return this.board[address.getX()][address.getY()];
    }

    public Player getCurrentPlayer()
    {
        return currentPlayer;
    }

    public void setCurrentPlayer(Player currentPlayer)
    {
        this.currentPlayer = currentPlayer;
    }

    
}
