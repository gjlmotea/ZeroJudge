package test;

import java.util.Scanner;
	
public class test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			int M, D;
			M = scanner.nextInt();
			D = scanner.nextInt();
			
			switch((M*2 + D) % 3) {
				case 0:  System.out.print("普通"); break;
				case 1:  System.out.print("吉"); break;
				case 2:  System.out.print("大吉"); break;
			}
		}

	}
	
}
	

