package ThreeStackinArray;

import java.util.EmptyStackException;

public class FixedMultiStack {

    private int numberOfStacks = 3;
    private int stackCapacity;
    private int[] values;
    private int[] sizes;

    public FixedMultiStack(int stackSize) {
        stackCapacity = stackSize;
        values = new int[stackSize * stackCapacity];
        sizes = new int[numberOfStacks];
    }

    /**
     * Push value into stack
     *
     * @param stackNum
     * @param value
     * @throws FullStackException
     */
    public void push(int stackNum, int value) throws FullStackException {
        // check if we have space for next element
        if (isFull(stackNum)) {
            throw new FullStackException();
        }

        // increment stack pointer and then update top value
        sizes[stackNum]++;
        values[indexOfTop(stackNum)] = value;
    }

    /**
     * Pop item from top stack
     *
     * @param stackNum
     * @throws EmptyStackException
     */
    public int pop(int stackNum) throws EmptyStackException {
        if (isEmpty(stackNum)) {
            throw new EmptyStackException();
        }

        int topIndex = indexOfTop(stackNum);
        int value = values[topIndex];
        values[topIndex] = 0; // clear
        sizes[stackNum]--;
        return value;
    }

    /**
     * Return top element
     *
     * @param stackNum
     * @return
     * @throws EmptyStackException
     */
    public int peek(int stackNum) throws EmptyStackException {
        if (isEmpty(stackNum)) {
            throw new EmptyStackException();
        }
        return values[indexOfTop(stackNum)];
    }

    /**
     * Check if stack empty
     *
     * @param stackNum
     * @return
     */
    private boolean isEmpty(int stackNum) {
        return sizes[stackNum] == 0;
    }

    /**
     * Give index of stack number in array
     *
     * @param stackNum
     * @return
     */
    private int indexOfTop(int stackNum) {
        int offset = stackNum * stackCapacity;
        int size = sizes[stackNum];
        return offset + size - 1;
    }

    /**
     * check if stack is full
     *
     * @param stackNum
     * @return
     */
    private boolean isFull(int stackNum) {
        return sizes[stackNum] == stackCapacity;
    }
}
