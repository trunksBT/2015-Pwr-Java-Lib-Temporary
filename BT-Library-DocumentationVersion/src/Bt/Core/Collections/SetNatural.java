package Bt.Core.Collections;

public class SetNatural
{
    final int BASE = 10;
    StackNatural _set;
    StackNatural _stack;

    public SetNatural(){
    	_set = new StackNatural();
    	rebuildStackFromSet();
    }
  
    public SetNatural(int aStack){
    	_set = new StackNatural();
    	rebuildSet(properElementsBigEndianed(new StackNatural(aStack)));
    	rebuildStackFromSet();
    }
    
    private void rebuildStackFromSet() {
    	_stack = new StackNatural(_set);
    }
    
    private void rebuildSet(StackNatural aStack) {
    	_set = new StackNatural(aStack);
    }
    
    private StackNatural properElementsBigEndianed(StackNatural aInStack) {
    	StackNatural _buffRet = new StackNatural();
    	
    	while(!aInStack.isEmpty()){
    		int buffPoped = aInStack.pop();
    		int properElement = idxIfUnique(buffPoped, aInStack);
			_buffRet.push(properElement);
    	}
    	
    	return _buffRet;
    }

	private int idxIfUnique(int aElement, StackNatural aInStack) {
		boolean flagUnique = false;
		StackNatural _buffArg = new StackNatural(aInStack);
		
		do
		{
			if(aElement==_buffArg.pop())
				flagUnique = true;	
		}while(!_buffArg.isEmpty());
		
		if(!flagUnique) return aElement;
		else return 0;
	}
    
    public boolean remove(int aElement){
    	boolean flagRemove = false;
    	StackNatural _tempBuff = new StackNatural();
    	
    	while(!_stack.isEmpty())
    	{
    		int buffCurr = _stack.pop();
    		
    		if(buffCurr==aElement)
    			{
    				flagRemove=true;
    			}
    		else {
    			_tempBuff.push(buffCurr);
    		}
    	} 	
    	
    	rebuildSet(_tempBuff);
    	rebuildStackFromSet();
    	
    	return flagRemove;
    }

    public boolean add (int aElement){
    	boolean flagAdd = true;
    	
    	while(!_stack.isEmpty())
    	{
    		int properElement = idxIfUnique(aElement, _stack);
    		
    		if(properElement==aElement)
    			flagAdd&=true;
    		else {
    			flagAdd&=false;
			}
    		
    		_stack.pop();
    	} 	
    	
    	_set.push(aElement);
    	
    	rebuildStackFromSet();
    	
    	return flagAdd;
    }
    
    public boolean equals(SetNatural aVal){
    	StackNatural inStack = aVal._stack;
    	boolean retVal = true;
    	    	
    	while(!_stack.isEmpty())
    	{
    		int buffPoped = _stack.pop();
    		int properElement = idxIfUnique(buffPoped, inStack);
    		
    		if(properElement==buffPoped)
    			retVal&=true;
    	}
    	
    	rebuildStackFromSet();
    	
    	return retVal;
    }
    
    public boolean isEmpty(){
    	return _set.isEmpty();
    }
	 
    public String toString(){
        return "[Set:"+_set+"]";
    }
}