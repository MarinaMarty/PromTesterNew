package tester;

public class tester {
	public static void main(String[] args) {
		
		String [] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		double sum =0;
		for(String a : names)
			sum += a.length();
		
		System.out.println("Total Sum: " + (int)sum);
		System.out.println("Average name size is " +( sum / names.length) );
		
	}

}
