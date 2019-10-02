package test;

import java.util.Scanner;
	
public class test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			int year = scanner.nextInt();
			
			if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
				System.out.println("閏年");
			}else {
				System.out.println("平年");
			}
		}

	}
	
}
	

