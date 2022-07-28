import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Day7_Q01_ArrayList {
	/*
	 * 1) Write a programs for each of below for adding, remove and iteration using
	 * Iterator ArrayList LInkedList Vector Stack
	 * 
	 * HashSet LinkedHashSet TreeSet
	 * 
	 * HashMap LinkedHashMap TreeMap
	 */
	public static void main(String[] args) {
		List<String> banks = new ArrayList<String>();
		
		banks.add("BoA");
		banks.add("Chase");
		banks.add("Capital One");
		banks.add("MoneyBank");
		
		for(String bank: banks) {
			System.out.print(bank + " ");
		}
		
		System.out.println(" ");
		
		banks.remove(3);
		
		Iterator<String> banksItr= banks.iterator();
		
		while (banksItr.hasNext()) {
			System.out.print(banksItr.next() + " ");
		}
	}

}
