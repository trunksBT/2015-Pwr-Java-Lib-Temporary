package Bt.Core.Collections.Interfaces;

public interface IIterable {
	public void previous();
	public void next();
	public void first();
	public void last();
	public boolean isEmpty();
	public Object current();
}