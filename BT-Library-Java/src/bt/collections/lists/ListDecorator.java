package bt.collections.lists;

import bt.collections.interfaces.List;

public abstract class ListDecorator implements List{
	protected List tape;
	
	public ListDecorator(List tape) {
		if( tape != null )
			this.tape = tape;
		else
			this.tape = new LinkedList();
	}
	
	public abstract boolean isDirty();
	public abstract void setDirty(boolean val);
}
