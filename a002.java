package test;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			int input1 = scanner.nextInt();
			int input2 = scanner.nextInt();
			System.out.println(input1 + input2);		
		}
	}
}
