package com.pakage;

import java.util.Scanner;

public class ArithmeticOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a value:");
		int v1 = keyboard.nextInt();
		int v2 = keyboard.nextInt();
		int operation = keyboard.nextInt();
		int result = 0;
		switch(operation) {
		case 1: result = (v1+v2);
				System.out.println("result:"+result);
				break;
				
		case 2: result = (v1-v2);
				System.out.println("result:"+result);
				break;
				
		case 3: result = (v1*v2);
				System.out.println("result:"+result);
				break;
				
		case 4: result = (v1/v2);
				System.out.println("result:"+result);
				break;
				
		default: System.out.println("Invalid option!");
				break;
		}
	}

}
