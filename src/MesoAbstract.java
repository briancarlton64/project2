/**
 * An abstract class with two abstract methods. 
 * Sub classes will implement the methods as needed.
 * MesoInherit is a subclass of MesoAbstract.
 * 
 * @author Brian Carlton
 * @version 2019-03-07
 */
public abstract class MesoAbstract
{    
    /**
     * A char array used in the following methods.
     */
	char[] st;
	/**
     * A method to calculate the average value of an array.
     * 
     * @return a int array formatted as follows:
     * 				int[2] The average (rounded) value.
     * 				int[0] The ceiling of the average.
     * 				int[1] The floor of the average.
     */
	public abstract int[] calAverage();
	
	/**
	 * 	A method to return a char representation of
	 * 	calAverage()[0] (i.e. the average char of the array.)
	 * 
	 * @return the average char of the array.
	 */
    public abstract char letterAverage();
}
