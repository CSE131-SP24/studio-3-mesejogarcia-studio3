package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Numbers jit: ");
		int n = in.nextInt();
		int [] numbers = new int[n];
		boolean [] prime = new boolean[n];
		int value = 0;
		System.out.println("Prime numbers be: ");
		for (int i = 0; i<n-1;i++) {
			numbers[i] = value;
			prime[i] = true;
			//System.out.println(numbers[i]);
			//System.out.println(prime[i]);
			value++;
		}
		for (int w =2;w*w< n;w++) {
			if (prime[w]==true) {
				for (int j = w * w; j<n;j+=w) {
					prime[j]= false;
				}
			}
		}
		for (int k = 0;k<n;k++) {
			if ((prime[k]==true)&&(k>=2)) {
				System.out.println(numbers[k]);
			}
		}
		
	
	}

}
