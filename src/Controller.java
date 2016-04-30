public class Controller
{
	private Board model;
	private View view;
	
	public Controller(Board model, View view)
	{
		this.model = model;
		this.view = view;
	}
	
	public void printBoard()
	{
		view.printBoard(model.getBoard());
	}
	
	public void moveMan(Vector2 source, Vector2 destination)
	{
		model.moveMan(source, destination);
	}
	
	
	public Man[][] getBoard() 
	{
		return model.getBoard();
	}
	
	public void updateView()
	{
		view.updateBoard(model.getBoard());
	}
}
