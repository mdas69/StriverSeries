package progs.basic;

import java.util.Scanner;

public class Fibo {
	public static void main(String[] args) {
		System.out.println(fiboFunction());
	}

	public static long fiboFunction() {
		Scanner sc = new Scanner(System.in);
		System.out.print("The nth element at fibo series, ENTER THE Nth NUMBER : ");
		long n = sc.nextLong();
		sc.close();
		
		long a = 1;
		long b = 1;
		long sum = 0;
		System.out.print("printing the series : "+a+","+b);
		while (n - 2 != 0) {

			sum = a + b;
			a = b;
			b = sum;
			System.out.print(","+sum);
			n--;
		}
		System.out.println();
		return sum;
		

	}
}
