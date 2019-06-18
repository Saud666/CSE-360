package cse360assign2;

public class AddingMachine {
	private int total;
	private String history;
	 
	/**
	 * Constructor to initialize variables
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		history = total + " "; 	// initialize history with value of total
	}
	
	/**
	 * Method to get total
	 * @return
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * Method to add value into total 
	 * @param value
	 */
	public void add (int value) {
		total += value;
		// add to history
		history += "+ " + value + " ";
	}
	
	/**
	 * Method to subtract value from total
	 * @param value
	 */
	public void subtract (int value) {
		total -= value;
		// add to history
		history += "- " + value + " ";
	}
	
	/**
	 * Method to get string representation of history of operations
	 */
	public String toString () {
		return history;
	}

	/**
	 * Method to clear all the variables values
	 */
	public void clear() {
		// reset value of total
		total = 0;
		// reset history to empty string
		history = "";
	}
}
