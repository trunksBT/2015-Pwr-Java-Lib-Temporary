package bt.geometry.shapes;

@SuppressWarnings("serial")
public class Shape implements IShape{	
	public String name;
		
	public Shape(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		return this.name.equals(((Shape)obj).name);
	}
	
	public double obwod()
	{
		return 0;
	}
	
	public String toString()
	{
		return String.format("%-12s",name);
	}
}
