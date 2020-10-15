import java.util.Observable 

public class Source extends Observable{
	
	private int x, y;
	
	public void create() {
		x = (int) (Math.random() * 500) + 1;
		y = (int) (Math.random() * 500) + 1;
		setChanged();
		notifyObservers();
	}
	
	public int getX() { return x;}
	
	public int getY() { return y;}
	
	
}