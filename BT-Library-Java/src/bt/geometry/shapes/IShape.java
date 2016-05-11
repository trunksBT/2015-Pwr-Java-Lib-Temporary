package bt.geometry.shapes;

import java.io.Serializable;

public interface IShape extends Serializable{
	boolean equals(Object obj);
	int hashCode();
	public double obwod();
	public String toString();
}
