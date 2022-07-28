import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class Day7_Q01_HashSet {
	/*
	 * 1) Write a programs for each of below for adding, remove and iteration using
	 * Iterator ArrayList LInkedList Vector Stack
	 * 
	 * HashSet LinkedHashSet TreeSet
	 * 
	 * HashMap LinkedHashMap TreeMap
	 */
	public static void main(String[] args) {
		HashSet<String> banks = new HashSet<String>();

		banks.add("Bank of America");
		banks.add("Chase");
		banks.add("Capital One");
		banks.add("MoneyBank");

		System.out.print(banks);

		System.out.println(" ");

		banks.remove("MoneyBank");

		Iterator<String> banksItr = banks.iterator();

		while (banksItr.hasNext()) {
			System.out.print(banksItr.next() + " ");
		}

	}

}
