import java.util.Vector;
import java.util.Iterator;

public class Day7_Q01_Vector {
	/*
	 * 1) Write a programs for each of below for adding, remove and iteration using
	 * Iterator ArrayList LInkedList Vector Stack
	 * 
	 * HashSet LinkedHashSet TreeSet
	 * 
	 * HashMap LinkedHashMap TreeMap
	 */
	public static void main(String[] args) {
		Vector<String> banks = new Vector<String>();

		banks.add("Bank of America");
		banks.add("Chase");
		banks.add("Capital One");
		banks.add("MoneyBank");

		System.out.print(banks);

		System.out.println(" ");

		banks.remove(3);

		Iterator<String> banksItr = banks.iterator();

		while (banksItr.hasNext()) {
			System.out.print(banksItr.next() + " ");
		}

	}

}
