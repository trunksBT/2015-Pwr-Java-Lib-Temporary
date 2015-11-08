package Bt.Tests.Core.Collections;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import Bt.Core.Collections.StackNatural;
import junit.framework.TestCase;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class TestStackNatural extends TestCase {

    @Test
    public void testEqualsQueuesTheSameTrue()
    {
        //arrange
        StackNatural _queueA = new StackNatural(212);
        StackNatural _queueB = new StackNatural(212);
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
        StackNatural _queueA = new StackNatural(212);
        StackNatural _queueB = new StackNatural(213);
        boolean expected = false;
        
        //act
        boolean reached = _queueA.equals(_queueB);
        
        //assert
        boolean result = !(expected ^ reached);
        assertTrue(result);
    }
    
    @Test
    public void testPopTrue()
    {
        //arrange
        StackNatural _queueA = new StackNatural(212);
        StackNatural _queueB = new StackNatural(21);
        int expectPopd = 2;
        boolean expectedAfter = true;
        
        //act
        int reachedPopd = _queueA.Pop();
        boolean reachedAfter = _queueA.equals(_queueB);
        
        //assert
        boolean result = expectPopd == reachedPopd;
        boolean resultAfter = !(expectedAfter ^ reachedAfter);
        assertTrue(result);
        assertTrue(resultAfter);
    }
    
    @Test
    public void testPopFalse()
    {
        //arrange
        StackNatural _queueA = new StackNatural(212);
        StackNatural _queueB = new StackNatural(21);
        int expectPopd = 4;
        boolean expectedAfter = true;
        
        //act
        int reachedPopd = _queueA.Pop();
        boolean reachedAfter = _queueA.equals(_queueB);
        
        //assert
        boolean result = expectPopd != reachedPopd;
        boolean resultAfter = !(expectedAfter ^ reachedAfter);
        assertTrue(result);
        assertTrue(resultAfter);
    }
    
    @Test
    public void testPushTrue()
    {
        //arrange
        StackNatural _queueA = new StackNatural(212);
        StackNatural _queueB = new StackNatural(2124);
        int val = 4;
        boolean expectedAfter = true;
        
        //act
        _queueA.Push(val);
        boolean reachedAfter = _queueA.equals(_queueB);
        
        //assert
        boolean resultAfter = !(expectedAfter ^ reachedAfter);
        assertTrue(resultAfter);
    }
       
    @Test
    public void testPushFalse()
    {
        //arrange
        StackNatural _queueA = new StackNatural(212);
        StackNatural _queueB = new StackNatural(2122);
        int val = 4;
        boolean expectedAfter = false;
        
        //act
        _queueA.Push(val);
        boolean reachedAfter = _queueA.equals(_queueB);
        
        //assert
        boolean resultAfter = !(expectedAfter ^ reachedAfter);
        assertTrue(resultAfter);
    }
    
    @Test
    public void testMergeTrue()
    {
        //arrange
        StackNatural _queueA = new StackNatural(212);
        StackNatural _queueB = new StackNatural(212674);
        int val = 476;
        boolean expectedAfter = true;
        
        //act
        _queueA.Merge(val);
        boolean reachedAfter = _queueA.equals(_queueB);
        
        //assert
        boolean resultAfter = !(expectedAfter ^ reachedAfter);
        assertTrue(resultAfter);
    }
    
    @Test
    public void testIsEmptyTrue()
    {
        //arrange
        StackNatural _queue = new StackNatural(0);
        boolean expectedResult = true;
        
        //act
        boolean reachedResult = _queue.IsEmpty();
        
        //assert
        boolean resultAfter = !(expectedResult ^ reachedResult);
        assertTrue(resultAfter);
    } 
    
    @Test
    public void testIsEmptyFalse()
    {
        //arrange
        StackNatural _queue = new StackNatural(1);
        boolean expectedResult = false;
        
        //act
        boolean reachedResult = _queue.IsEmpty();
        
        //assert
        boolean resultAfter = !(expectedResult ^ reachedResult);
        assertTrue(resultAfter);
    } 
}
