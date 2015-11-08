package Bt.Core.Collections;

public class SetNatural
{
    final int BASE = 10;
    final int DEFAULT_VALUE = 0;
    int _val;
    StackNatural _stack;

    public SetNatural()
    {
    	_val = DEFAULT_VALUE;
    	_stack = new StackNatural(_val);
    }
  
    public SetNatural(int aStack)
    {
    	_val = DEFAULT_VALUE;
    	_val = properElementsBigEndianed(new StackNatural(aStack));
    	_stack = new StackNatural(_val);
    }
    
//    public boolean Remove(int aElement)
//    {
//        int _SetCopy = _val;
//        int retVal = _SetCopy %= BASE;
//        _val -= retVal;
//        _val /= BASE;
//        
//        return retVal;
//    }//TODO

//    public void Add (int aElement)
//    {
//    	
//    	int buffDequeued;
//    	
//    	boolean breakFlag = false;
//    	
//    	while ( !_queue.IsEmpty() ^ breakFlag==true ) {
//        	
//        	buffDequeued = _queue.Dequeue();
//        	
//        	if(buffDequeued==aElement)
//        		{
//        			breakFlag = true;
//        			_val*=10;
//        			_val+=aElement;
//        		}
//        	else
//        	{
////    			_val*=10;
////    			_val+=buffDequeued;
//        	}
//		} 
//    	
//    	_queue = new QueueNatural(_val);
//    }
    
    public boolean equals(SetNatural aVal){
    	StackNatural _copy = new StackNatural(aVal._stack);
    	boolean retVal = true;
    	    	
    	while(!_copy.IsEmpty())
    	{
    		int buffPoped = _copy.Pop();
    		int properElement = returnIfUnique(buffPoped, _copy);
    		
    		if(properElement==buffPoped)
    			retVal&=true;
    	}
    	
    	return retVal;

    }
    
    public boolean IsEmpty(){
    	return _val==0;
    }
    
    public String toString(){
        return "[S:"+_val+"]";
    }
    
    private int properElementsBigEndianed(StackNatural aInStack) {
    	StackNatural _buffRet = new StackNatural();
    	
    	while(!aInStack.IsEmpty())
    	{
    		int buffPoped = aInStack.Pop();
    		int properElement = returnIfUnique(buffPoped, aInStack);
			_buffRet.Push(properElement);
    	}
    	
    	return _buffRet.getLittleEndianed();
    }

	private int returnIfUnique(int aElement, StackNatural aInStack) {
		boolean flagUnique = false;

		StackNatural _buffArg = new StackNatural(aInStack);
		
		do
		{
			if(aElement==_buffArg.Pop())
				flagUnique = true;	
		}while(_buffArg.IsEmpty()^flagUnique!=true);
		
		if(!flagUnique) return aElement;
		else return 0;
	}
}