package bt.collections.elems;

public class Player {
	private final String name;
	private final double points;
	
	public Player (String name, double points){
		this.name = name;
		this.points = points;
	}
	
	public double getPoints() {
		return points;
	}
	
	public String toString() {
		return "Pl: "+name+", Pts: "+points;
	}
}
