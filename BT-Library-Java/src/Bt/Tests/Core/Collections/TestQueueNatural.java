package Bt.Tests.Core.Collections;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import Bt.Core.Collections.QueueNatural;
import junit.framework.TestCase;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class TestQueueNatural extends TestCase {

    @Test
    public void testEqualsQueuesTheSameTrue()
    {
        //arrange
        QueueNatural _queueA = new QueueNatural(212);
        QueueNatural _queueB = new QueueNatural(212);
        boolean expected = true;
        
        //act
        boolean reached = _queueA.equals(_queueB);
        
        //assert
        boolean result = !(expected ^ reached);
        assertTrue(result);
    }
    
    @Test
    public void testEqualsQueuesTheSameFalse()
    {
        //arrange
        QueueNatural _queueA = new QueueNatural(212);
        QueueNatural _queueB = new QueueNatural(213);
        boolean expected = false;
        
        //act
        boolean reached = _queueA.equals(_queueB);
        
        //assert
        boolean result = !(expected ^ reached);
        assertTrue(result);
    }
    
    @Test
    public void testDequeueTrue()
    {
        //arrange
        QueueNatural _queueA = new QueueNatural(212);
        QueueNatural _queueB = new QueueNatural(21);
        int expectDequeued = 2;
        boolean expectedAfter = true;
        
        //act
        int reachedDequeued = _queueA.Dequeue();
        boolean reachedAfter = _queueA.equals(_queueB);
        
        //assert
        boolean result = expectDequeued == reachedDequeued;
        boolean resultAfter = !(expectedAfter ^ reachedAfter);
        assertTrue(result);
        assertTrue(resultAfter);
    }
    
    @Test
    public void testDequeueFalse()
    {
        //arrange
        QueueNatural _queueA = new QueueNatural(212);
        QueueNatural _queueB = new QueueNatural(21);
        int expectDequeued = 4;
        boolean expectedAfter = true;
        
        //act
        int reachedDequeued = _queueA.Dequeue();
        boolean reachedAfter = _queueA.equals(_queueB);
        
        //assert
        boolean result = expectDequeued != reachedDequeued;
        boolean resultAfter = !(expectedAfter ^ reachedAfter);
        assertTrue(result);
        assertTrue(resultAfter);
    }
    
    @Test
    public void testEnqueueTrue()
    {
        //arrange
        QueueNatural _queueA = new QueueNatural(212);
        QueueNatural _queueB = new QueueNatural(2124);
        int val = 4;
        boolean expectedAfter = true;
        
        //act
        _queueA.Enqueue(val);
        boolean reachedAfter = _queueA.equals(_queueB);
        
        //assert
        boolean resultAfter = !(expectedAfter ^ reachedAfter);
        assertTrue(resultAfter);
    }
    
    @Test
    public void testEnqueueFalse()
    {
        //arrange
        QueueNatural _queueA = new QueueNatural(212);
        QueueNatural _queueB = new QueueNatural(2122);
        int val = 4;
        boolean expectedAfter = false;
        
        //act
        _queueA.Enqueue(val);
        boolean reachedAfter = _queueA.equals(_queueB);
        
        //assert
        boolean resultAfter = !(expectedAfter ^ reachedAfter);
        assertTrue(resultAfter);
    }
    
}
