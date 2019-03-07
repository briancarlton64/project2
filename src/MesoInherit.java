public class MesoInherit extends MesoAbstract
{
	/**
	 * st is initialized with size 4 as provided
	 * by the design specification.
	 * (All MesoStations have ID length 4.)
	 */
	char[] st = new char[3];
	/**
	 * A constructor taking a MesoStation m
	 * and breaking its ID into a char array st.
	 * @param m The MesoStation to be passed.
	 */
	public MesoInherit(MesoStation m)
	{
		/**
		 * Set st to the char[] representing the ID string.
		 */
		st =m.getStID().toCharArray();
	}
	/**
	 * A method to calculate the averages of the st array.
	 * @return values, an int[] formatted as follows:
	 * 					int[2] The average (rounded) ascii value of st.
	 *					int[0] The ceiling of the average.
	 * 					int[1] The floor of the average.
	 */		
	@Override
	public int[] calAverage() {
		/**
		 * The int[] that we will be returning, initialized to size
		 * 4 as per documentation.
		 */
		int[] values = new int[3];
		/**
		 * A placeholder double to calculate the sum of ascii values of st.
		 */
		double sum = 0;
		/**
		 * Loop through the array to sum all the values.
		 */
		for(char c : st) {
			/**
			 * casting a char c to int will return the ascii value of said char.
			 */
			sum = sum+(int)c;
		}
		/**
		 * Assign the indices of values to the appropriate numerical values.
		 */
		values[2] = (int) Math.round(sum/st.length);
		values[0] = (int) Math.ceil(sum/st.length);
		values[1] = (int) Math.floor(sum/st.length);
		return values;
	}
	/**
	 * A simple method to return the average char of st.
	 * We use calAverage()[0] to get the average ascii value,
	 * then cast to char to return the char.
	 */
	@Override
	public char letterAverage() {
		return (char)calAverage()[0];
	}
  
}
