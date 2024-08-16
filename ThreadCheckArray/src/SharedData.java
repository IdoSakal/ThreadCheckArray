import java.util.ArrayList;

/**
 * The class representing shared data between threads, support for an integer list, a boolean array,
 * and a flag. This class provides methods to get and set these values and ensures thread-safety
 * for the flag property.
 */
public class SharedData {
    
    /**
     * The list of integers given from the input.
     */
    private ArrayList<Integer> array;
    // private int [] array; 

    
    /**
     * An array that hold which location of numbers sum is equal to the required number.
     */
    private boolean[] winArray;
    
    /**
     * A flag indicating if thread finished his job finding all the numbers required.
     */
    private boolean flag;
    
    /**
     * The required number to find sum in the array.
     */
    private final int b;

    /**
     * Constructs a new instance of SharedData with the specified integer list and integer value.
     *
     * @param array the list of integers from input
     * @param b the integer value you need to find sum to
     */
    public SharedData(/*int[]*/ ArrayList<Integer> array, int b) {
        this.array = array;
        this.b = b;
    }

    /**
     * Returns the boolean array of the thread that found all the numbers that build the required number first.
     *
     * @return the boolean array
     */
    public boolean[] getWinArray() {
        return winArray;
    }

    /**
     * Sets the boolean array of the thread that found all the numbers that build the required number first.
     *
     * @param winArray the boolean array to set
     */
    public void setWinArray(boolean[] winArray) {
        this.winArray = winArray;
    }

    /**
     * Returns the list of integers received to find if some  of their sum equals the required number.
     *
     * @return the list of integers
     */
    public ArrayList<Integer> getArray() {
    // public int[] getArray()
        return array;
    }
    
    /**
     * Returns the value that the threads required to find number in array that they sum equal to his.
     *
     * @return the final integer value
     */
    public int getB() {
        return b;
    }

    /**
     * Returns the flag indicating if thread found the numbers to build the desired number.
     *
     * @return the flag
     */
    public boolean getFlag() {
        return flag;
    }

    /**
     * Sets the flag indicating thread found the numbers to build the desired number.. This method is synchronized to ensure thread-safety.
     *
     * @param flag the flag to set
     */
    public synchronized void setFlag(boolean flag) {
        this.flag = flag;
    }
}
