package bt.collections.iterators;

public abstract class ItPrint implements Iterator{
	public String toString() {
		return "Curr: "+ current();
	}
}
