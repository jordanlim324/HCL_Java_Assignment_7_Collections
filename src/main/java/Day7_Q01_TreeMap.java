import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class Day7_Q01_TreeMap {
	/*
	 * 1) Write a programs for each of below for adding, remove and iteration using
	 * Iterator ArrayList LInkedList Vector Stack
	 * 
	 * HashSet LinkedHashSet TreeSet
	 * 
	 * HashMap LinkedHashMap TreeMap
	 */
	public static void main(String[] args) {
		TreeMap<Integer,String> banks = new TreeMap<Integer,String>();

		banks.put(1, "Bank of America");
		banks.put(2, "Chase");
		banks.put(3, "Capital One");
		banks.put(4, "MoneyBank");

		for (int i: banks.keySet()) {
			System.out.println("Key: " + i + " value: " + banks.get(i));
		}

		System.out.println(" ");

		banks.remove(4);
		
		Set banksSet = banks.entrySet();
		
		Iterator banksItr = banksSet.iterator();

		while (banksItr.hasNext()) {
			System.out.println(banksItr.next() + " ");
		}

	}

}
