/**Program:Prog_Exercise7_1
 * File:Prog_Exercise7_1.java
 * Summary:First checks if a number is prime.  Then checks if prime # is palindromic.  Then displays all palindromic prime #'s.
 * Author:Lorenzo Quintana
 * Date:Jan 02, 2018
 */

/*I'm having trouble getting this program to work.  I understand the actions in theory.
 * First you have your main class which displays an array holding all the prime parlindrome numbers from 1 to 100,000.
 * Second you have a find prime number class.  This tests all numbers and determines if they are prime.  If they are
 * it stores it in a prime array.  If not it goes to the next number.
 * Finally you have a palindrome class which takes all the numbers from the prime array and determines if they are a 
 * palindrome number.  If so they are placed into the palindrome prime array, if not it goes to the next number.  Then
 * all the values in the prime palindrome array are displayed in the main class.  It makes sense in theory I just cannot
 * make it work in practice.
 * 
 * First:If I don't know how many values between 1 and 100,000 are primes how do I know how large to make the array since
 * the size cannot be changed later.  If it's to small not all numbers are stored.  If to large it takes up space.
 * 
 * Second:I cannot get the findPrimeNumber class to display the values in the primeList array.  Not sure what I'm doing wrong and
 * after spending five days on this I'm not sure I can fix it.
 */
public class Prog_Exercise7_1 {
	public static void main (String[]args) {

		}
		
/*I cannot figure out what i'm doing wrong here.  Since I don't know how large the array of primeNumbers should be I made it 10,000
 * just cause personally I don't believe that 100,000 has more than 10,000 prime numbers.  
 * 
 * I than make an int that increases every time the program finds a prime number so that way,
 *  the next class can use that number to make it's palindrome array a much smaller size.
 * Yes, it will still be to large but it will be closer than just putting a random value there.  
 * 
 * Next I create two values.  The first int i is the current number between 1 and 100,000 being checked.  The second int j is the number
 * of the array reference that goes up every time a prime number is stored.
 * 
 */
public class findPrimeNumber {
	int [] primeList = new int [10000];{
	/**The numbers 2,3,5,7 are all added to the array manually since my rules for determine a prime number wouldn't work for them.  If a number is 
	 * divisible by 2,3,5,7 the four base numbers than it is not prime, but if it isn't than it is.  The issue is that 2,3,5,7 are all divisible, by
	 * 2,3,5,7 so the rules don't work for those numbers.  Hence the manual addition.  This is why both int j which represents the array location starts
	 * at the value of 4 and int i which is the number being tested for prime starts at 8.
	 */
	primeList[0] = 2;
	primeList[1] = 3;
	primeList[2] = 5;
	primeList[3] = 7;
}
	public int listSize = 0;
	private int i = 8;
	private int j = 4; {
	
	
	if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
		i++;
}
	else if (i == 10000) {
		for (int k = 0; k < primeList.length; k++) {
			System.out.println(primeList[k]);
	}
}
	else
		primeList[j] = i;
		i++;
		j++;
		listSize++;
		

	}
}
}