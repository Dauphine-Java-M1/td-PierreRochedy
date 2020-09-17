package fr.dauphine.ja.rochedypierre.td00;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class PrimeCollection {

	private java.util.ArrayList<Integer> numbers;

	public PrimeCollection(ArrayList<Integer> numbers) {
		super();
		this.numbers = numbers;
	}

	public void initRandom(int n, int m) {

		for (int i = 0; i < n; i++)
			numbers.add((int) (Math.random() * (m)));

	}

	public boolean isPrime(int p) {

		for (int i = 2; i <= Math.sqrt(p); i++) {
			
			if (p % i == 0)
				return false;
		}

		return true;
	}

	public void printPrimes() {
		for (int j = 0; j < numbers.size(); j++) {
			
			if (isPrime(numbers.get(j)) == true)
				System.out.println(numbers.get(j));

		}

	}

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		PrimeCollection p = new PrimeCollection(list);
		p.initRandom(100, 2000);
		p.printPrimes();

	}

}
