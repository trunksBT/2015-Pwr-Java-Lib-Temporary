package Bt.Core.Collections;
import Bt.Core.Collections.Interfaces.ILittleEndian;
import Bt.Core.Collections.Interfaces.IMergable;

public class StackNatural implements IMergable,ILittleEndian
{
    final int BASE = 10;
    final int DEFAULT_VALUE = 0;
    int _val;

    public StackNatural(){
    	_val = DEFAULT_VALUE;
    }
    
    public StackNatural(int aVal){
    	_val = aVal;
    }
    
    public StackNatural(StackNatural aStack) {
    	_val = aStack._val;
    }

    public int Pop(){
    	int retVal = peekFirst();
        _val -= retVal;
        _val /= BASE;
        
        return retVal;
    }
    
    public void Push (int aElement){
    	if(aElement!=0) {
    		_val*=BASE;
    		_val+=aElement;    
    	}
    }
        
    public boolean IsEmpty(){
    	return _val==0;
    }
	
    public boolean equals(StackNatural aVal)
    {
        return _val == aVal._val;
    }
    
    public int getLittleEndianed() {
    	return _val;
    }
    
    @Override
    public String toString()
    {
        return "[Q:"+_val+","+BASE+"]";
    }

	@Override
	public int peekFirst() {
        return _val % BASE;
	}

	@Override
	public void Merge(Object aSecond) {
    	StackNatural _buffStack = (StackNatural)aSecond;
    	int buffDequeued;
    	
    	while ( !_buffStack.IsEmpty()) {	        	
        	buffDequeued = _buffStack.Pop();
        	Push(buffDequeued);
		} 
	}
}