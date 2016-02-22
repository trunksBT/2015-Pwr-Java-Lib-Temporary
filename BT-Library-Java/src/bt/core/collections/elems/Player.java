package bt.core.collections.elems;

public class Player {
	private final String name;
	private final int points;
	
	public Player (String name, int points){
		this.name = name;
		this.points = points;
	}
	
	public int getPoints() {
		return points;
	}
	
	public String toString() {
		return "Pl: "+name+", Pts: "+points;
	}
}
