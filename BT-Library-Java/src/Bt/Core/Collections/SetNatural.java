package Bt.Core.Collections;

public class SetNatural
{
    final int BASE = 10;
    final int DEFAULT_VALUE = 0;
    int _val;
    QueueNatural _queue;

    public SetNatural()
    {
    	_queue = new QueueNatural(DEFAULT_VALUE);
    	_val = DEFAULT_VALUE;
    	//TODO filterQueue With Set Methods
    }
  
    public SetNatural(int aQueue)
    {
    	_queue = new QueueNatural(aQueue);
    	//TODO filterQueue With Set Methods
    }
    
    
//    private void filterRepetitions() {
//    	QueueNatural buffCopy = 
//    }//TODO

//    public boolean Remove(int aElement)
//    {
//        int _SetCopy = _val;
//        int retVal = _SetCopy %= BASE;
//        _val -= retVal;
//        _val /= BASE;
//        
//        return retVal;
//    }//TODO

    public void Add (int aElement)
    {
    	
    	int buffDequeued;
    	
    	boolean breakFlag = false;
    	
    	while ( !_queue.IsEmpty() ^ breakFlag==true ) {
        	
        	buffDequeued = _queue.Dequeue();
        	
        	if(buffDequeued==aElement)
        		{
        			breakFlag = true;
        			_val*=10;
        			_val+=aElement;
        		}
        	else
        	{
//    			_val*=10;
//    			_val+=buffDequeued;
        	}
		} 
    	
    	_queue = new QueueNatural(_val);
    }
    
    public boolean equals(SetNatural aVal)
    {
        return _val == aVal._val;
    }
    
    public String toString()
    {
        return "S:"+_val;
    }  
}