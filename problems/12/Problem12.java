/*
The sequence of triangle numbers is generated by adding the natural numbers.
So the 7th triangle number would be 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28.
The first ten terms would be:
1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...

Let us list the factors of the first seven triangle numbers:
 1: 1
 3: 1,3
 6: 1,2,3,6
10: 1,2,5,10
15: 1,3,5,15
21: 1,3,7,21
28: 1,2,4,7,14,28
We can see that 28 is the first triangle number to have over five divisors.
What is the value of the first triangle number
to have over five hundred divisors?
 */

public class Problem12 {
	// calculate the number of divisors for a number
	static int cntDivisors(int n) 
    { 
        int cnt = 0; 
        for (int i = 1; i <= Math.sqrt(n); i++) 
        { 
            if (n % i == 0) { 
                // count only 1 if divisors are equal
                if (n / i == i) 
                    cnt++; 
                else // otherwise count both
                    cnt = cnt + 2; 
            } 
        } 
        return cnt; 
    } 

	public static void main(String[] args) {
		int sum = 1;
		int num = 1;
		while (cntDivisors(sum) < 500) {
			num++;
			sum += num;
		}
		System.out.println("Triangle Number: "+sum);
		System.out.println("Divisors: "+cntDivisors(sum));
	}
}