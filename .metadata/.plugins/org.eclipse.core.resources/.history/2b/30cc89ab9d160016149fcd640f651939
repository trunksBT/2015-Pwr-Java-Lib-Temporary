package bt.core.collections.dataTypes;

import bt.core.collections.interfaces.List;
import bt.core.collections.iterators.Iterator;

public abstract class AbstractList implements List {
	
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("[ ");
		
		if(!isEmpty()) {
			Iterator it = iterator();
			
			for(it.first();!it.isDone();it.next())
				buffer.append(it.current()).append(", ");
			
			buffer.setLength(buffer.length() -2);
		}
		
		buffer.append("]");
		return buffer.toString();
	}
	
	public boolean equals(Object obj) {
		return obj instanceof List ? equals ((List) obj) : false;
	}
	
	public boolean equals(List inList) {
		boolean retVal = false;
		
		if( inList != null && size() == inList.size() ) {
			Iterator itThis = iterator();
			Iterator itInList = inList.iterator();
			
			for(itThis.first(), itInList.first();
					!itThis.isDone() && !itInList.isDone() && itThis.current().equals(itInList.current());
						itThis.next(), itInList.next()) {}
				
				return itThis.isDone() && itInList.isDone();
		}
		
		return retVal;
	}
	
	public int hashCode() {
		int hashCode = 0;
		
		Iterator it = iterator();
		for(it.first(); !it.isDone(); it.next())
			hashCode^= it.current().hashCode();
		
		return hashCode;
	}
}
