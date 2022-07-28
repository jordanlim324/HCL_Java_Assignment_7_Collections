import java.util.Stack;
import java.util.Iterator;

public class Day7_Q01_Stack {
	/*
	 * 1) Write a programs for each of below for adding, remove and iteration using
	 * Iterator ArrayList LinkedList Vector Stack
	 * 
	 * HashSet LinkedHashSet TreeSet
	 * 
	 * HashMap LinkedHashMap TreeMap
	 */
	public static void main(String[] args) {
		Stack<String> banks = new Stack<String>();

		banks.add("Bank of America");
		banks.add("Chase");
		banks.add("Capital One");
		banks.add("MoneyBank");

		System.out.println(banks);

		System.out.println("The top of the stack is: " + banks.peek());

		banks.pop();

		Iterator<String> banksItr = banks.iterator();

		while (banksItr.hasNext()) {
			System.out.print(banksItr.next() + " ");
		}

	}

}
