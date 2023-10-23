package conditionsLoops;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter numbers to reverse : ");
		int num = sc.nextInt();
		int ans = 0;
		
		while(num > 0) {
			int rem = num % 10;
			num /= 10;
			
			ans = ans * 10 + rem;
		}
		System.out.println(ans);

	}

}
