package Lab1.Stack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class StackTest {
    private Stack stack;

    @Before
    public void setUp() {
        stack = new Stack();
    }

    @Test
    public void testPushAndPop() {
        stack.push(10);
        stack.push(20);
        stack.push(30);
        Assert.assertEquals(30, stack.pop());
        Assert.assertEquals(20, stack.pop());
        Assert.assertEquals(10, stack.pop());
    }

    @Test
    public void testPushMultipleElements() {
        int[] elements = {10, 20, 30};
        stack.push(3, elements);
        Assert.assertEquals(30, stack.pop());
        Assert.assertEquals(20, stack.pop());
        Assert.assertEquals(10, stack.pop());
    }

    @Test
    public void testPopMultipleElements() {
        stack.push(10);
        stack.push(20);
        stack.push(30);
        List<Integer> poppedElements = stack.pop(2);
        Assert.assertEquals(Arrays.asList(30, 20), poppedElements);
        Assert.assertEquals(10, stack.pop());
    }

    @Test
    public void testEmptyStack() {
        Assert.assertTrue(stack.isEmpty());
        stack.push(10);
        Assert.assertFalse(stack.isEmpty());
        Assert.assertEquals(10, stack.pop());
        Assert.assertTrue(stack.isEmpty());
    }

    @Test
    public void testStackSize() {
        Assert.assertEquals(0, stack.size());
        stack.push(10);
        stack.push(20);
        stack.push(30);
        Assert.assertEquals(3, stack.size());
        stack.pop();
        Assert.assertEquals(2, stack.size());
        stack.pop(2);
        Assert.assertEquals(0, stack.size());
    }
}