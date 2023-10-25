package conditionsLoops;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		/*Syntax of for loops:
  		for(initialization; condition; increment/decrement){
    		//body
		}
  		*/
		
		//Print numbers from 1 to 5
		for(int num = 1; num <=5; num++)
		{
			System.out.println(num);
		}
		
		//Print numbers from 1 to n
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int nm = 1; nm <= n; nm++) {
			System.out.print(nm+ " ");
			System.out.println("Hello World");
		}
		
		//while loops
		/*Syntax: while(condition){ //body }*/
		int num = 1;
		while(num <= 5)
		{
			System.out.println(num);
			num += 1;
		}
		
		//do while
		do {
			System.out.println("Hello World");
		}while(n != 1);
	}
}
