package Bt.Core.Collections;

public class StackNatural
{
    final int BASE = 10;
    int _val;
//
//    public QueueNatural(QueueNatural aVal)
//    {
//        _val = aVal.dequeueAll();
//    }//TODO
//    
    public StackNatural(int aVal)
    {
        _val = aVal;
    }

    public int Pop()
    {
        int _queueCopy = _val;
        int retVal = _queueCopy %= BASE;
        _val -= retVal;
        _val /= BASE;
        
        return retVal;
    }
    
    public void Push (int aElement)
    {
        _val*=BASE;
        _val+=aElement;    
    }
    
    public void PushAll(int aElement)
    {
    	QueueNatural _buffQueue = new QueueNatural(aElement);
    	int buffDequeued;
    	
    	while ( !_buffQueue.IsEmpty()) {
        	
        	buffDequeued = _buffQueue.Dequeue();
        	Push(buffDequeued);
		} 
    }
    
    public boolean IsEmpty(){
    	return _val==0;
    }
    
    
    public boolean equals(StackNatural aVal)
    {
        return _val == aVal._val;
    }
    
    public String toString()
    {
        return "Q:"+_val;
    }  
}