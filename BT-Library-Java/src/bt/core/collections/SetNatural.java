package bt.core.collections;

public class SetNatural
{
    final int BASE = 10;
    StackNatural set;
    StackNatural stack;

    public SetNatural(){
    	set = new StackNatural();
    	rebuildStackFromSet();
    }
  
    public SetNatural(int aStack){
    	set = new StackNatural();
    	rebuildSet(properElementsBigEndianed(new StackNatural(aStack)));
    	rebuildStackFromSet();
    }
    
    private void rebuildStackFromSet() {
    	stack = new StackNatural(set);
    }
    
    private void rebuildSet(StackNatural aStack) {
    	set = new StackNatural(aStack);
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
    	
    	while(!stack.isEmpty())
    	{
    		int buffCurr = stack.pop();
    		
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
    	
    	while(!stack.isEmpty())
    	{
    		int properElement = idxIfUnique(aElement, stack);
    		
    		if(properElement==aElement)
    			flagAdd&=true;
    		else {
    			flagAdd&=false;
			}
    		
    		stack.pop();
    	} 	
    	
    	set.push(aElement);
    	
    	rebuildStackFromSet();
    	
    	return flagAdd;
    }
    
    public boolean equals(SetNatural aVal){
    	StackNatural inStack = aVal.stack;
    	boolean retVal = true;
    	    	
    	while(!stack.isEmpty())
    	{
    		int buffPoped = stack.pop();
    		int properElement = idxIfUnique(buffPoped, inStack);
    		
    		if(properElement==buffPoped)
    			retVal&=true;
    	}
    	
    	rebuildStackFromSet();
    	
    	return retVal;
    }
    
    public boolean isEmpty(){
    	return set.isEmpty();
    }
	 
    public String toString(){
        return "[Set:"+set+"]";
    }
}