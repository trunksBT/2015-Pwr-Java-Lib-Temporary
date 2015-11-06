package Bt.Core.Collections;

public class SetNatural
{
    final int BASE = 10;
    int _val;
    QueueNatural _queue;

    public SetNatural(QueueNatural aQueue)
    {
    	_queue = aQueue;
    	//TODO filterQueue With Set Methods
    }

    public boolean Remove(int aElement)
    {
        int _SetCopy = _val;
        int retVal = _SetCopy %= BASE;
        _val -= retVal;
        _val /= BASE;
        
        return retVal;
    }

    public void Add (int aElement)
    {
        int buffSetQueue = _val;
        boolean retVal = false;

        do
        {
            int buffDequeued = dequeue();

            if(buffDequeued==aElement)
                retVal = true;

        }while(retVal == false || aQueueCopy<0);
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