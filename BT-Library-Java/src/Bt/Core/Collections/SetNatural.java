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
    
    private void rebuildStack() {
    	_stack = new StackNatural(_val);
    }
//    public boolean Remove(int aElement)
//    {
//    	while(!aInStack.IsEmpty())
//    	{
//    		int buffPoped = aInStack.Pop();
//    		int properElement = returnIfUnique(buffPoped, aInStack);
//			_buffRet.Push(properElement);
//    	}
//    }

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
    	StackNatural inStack = aVal._stack;
    	boolean retVal = true;
    	    	
    	while(!_stack.IsEmpty())
    	{
    		int buffPoped = _stack.Pop();
    		int properElement = idxIfUnique(buffPoped, inStack);
    		
    		if(properElement==buffPoped)
    			retVal&=true;
    	}
    	
    	rebuildStack();
    	
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
    		int properElement = idxIfUnique(buffPoped, aInStack);
			_buffRet.Push(properElement);
    	}
    	
    	return _buffRet.getLittleEndianed();
    }

	private int idxIfUnique(int aElement, StackNatural aInStack) {
		boolean flagUnique = false;

		StackNatural _buffArg = new StackNatural(aInStack);
		
		do
		{
			if(aElement==_buffArg.Pop())
				flagUnique = true;	
		}while(!_buffArg.IsEmpty());
		
		if(!flagUnique) return aElement;
		else return 0;
	}
}