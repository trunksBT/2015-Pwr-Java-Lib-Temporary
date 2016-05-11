package bt.collections.graphs;

public class DirtyEdgeDecorator<V,W> extends EdgeDecorator<V,W>{
	boolean isDirty;
	
	public DirtyEdgeDecorator(Edge<V,W> edge) {
		super(edge);
		isDirty = false;
	}
	
	public boolean isDirty() {
		return isDirty;
	}
	
	public void setDirty(boolean val) {
		isDirty = val;
	}

	@Override
	public V getStart() {
		System.out.println( "DirtyEdgeDecoratorClass" );
		return decorated.start;
	}

	@Override
	public V getEnd() {
		setDirty(true);
		return decorated.end;
	}

	@Override
	public W getWage() {
		return decorated.wage;
	}
}
