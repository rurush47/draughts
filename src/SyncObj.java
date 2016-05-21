import java.io.Serializable;

public class SyncObj implements Serializable{

	private static final long serialVersionUID = 1L;
	private Man[][] board;
	private boolean gameOver;
	private String test;
	private Vector2 source;
	private Vector2 destination;
	
	SyncObj(String text)
	{
		this.test = text;
	}
	
	SyncObj(Man[][] board, boolean gameOver)
	{
		this.board = board;
		this.gameOver = gameOver;
	}
	
	SyncObj(Man[][] board, boolean gameOver, String text)
	{
		this.board = board;
		this.gameOver = gameOver;
		this.test = text;
	}
	
	SyncObj(Vector2 source, Vector2 destination)
	{
		this.source = source;
		this.destination = destination;
	}
	
	public String getText()
	{
		return test;
	}
	
	public Man[][] getBoard()
	{
		return board;
	}
	
	public boolean getGameStatus()
	{
		return gameOver;
	}
	
	public Vector2 getSourceVector()
	{
		return source;
	}
	
	public Vector2 getDestinationVector()
	{
		return destination;
	}
}