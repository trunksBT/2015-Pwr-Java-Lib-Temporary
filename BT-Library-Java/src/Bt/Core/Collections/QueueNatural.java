package Bt.Core.Collections;

public class QueueNatural
{
    final int BASE = 10;
    int _val;

    public QueueNatural(int aVal)
    {
        _val = aVal;
    }

    public int dequeue()
    {
        int _queueCopy = _val;
        int retVal = _queueCopy %= BASE;
        _val -= retVal;
        _val /= BASE;
        
        return retVal;
    }

    public void enqueue (int aElement)
    {
        _val*=BASE;
        _val+=aElement;    
    }
    
    public boolean equals(QueueNatural aVal)
    {
        return _val == aVal._val;
    }
    
    public String toString()
    {
        return "Q:"+_val;
    }  
}