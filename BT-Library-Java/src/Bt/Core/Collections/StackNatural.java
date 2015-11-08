package Bt.Core.Collections;
import Bt.Core.Collections.Interfaces.IMergable;

public class StackNatural implements IMergable
{
    final int BASE = 10;
    int _val;

//    public StackNatural(QueueNatural aVal)
//    {
//        _val = aVal.Merge();
//    }
//    
//    public StackNatural(int aVal){
//        _val = aVal;
//    }

    public int Pop(){
        int _queueCopy = _val;
        int retVal = _queueCopy %= BASE;
        _val -= retVal;
        _val /= BASE;
        
        return retVal;
    }
    
    public void Push (int aElement){
        _val*=BASE;
        _val+=aElement;    
    }
        
    public boolean IsEmpty(){
    	return _val==0;
    }
    
	@Override
	public void Merge(int aSecond) {
	    	StackNatural _buffStack = new StackNatural(aSecond);
	    	int buffDequeued;
	    	
	    	while ( !_buffStack.IsEmpty()) {
	        	
	        	buffDequeued = _buffStack.Pop();
	        	Push(buffDequeued);
			} 
	} 
    
    public boolean equals(StackNatural aVal)
    {
        return _val == aVal._val;
    }
    
    public String toString()
    {
        return "[Q:"+_val+","+BASE+"]";
    }
}