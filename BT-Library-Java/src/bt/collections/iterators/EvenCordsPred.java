package bt.collections.iterators;

import bt.geometry.elementaries.Point;

public class EvenCordsPred implements Predicate {

	@Override
	public boolean accept(Object obj) {
		boolean retVal = false;
		
		if( obj instanceof Point) {
			Point temp = (Point) obj;
			retVal = temp.getX()%2 == 0 &&
					temp.getY() % 2 == 0;
		}
		
		return retVal;		
	}
}
