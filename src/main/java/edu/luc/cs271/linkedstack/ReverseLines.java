package edu.luc.cs271.linkedstack;

import java.util.Scanner;
import java.util.List;


public class ReverseLines {

	public static void main(String[] args) {
		// TODO read successive input lines until EOF, then print out in reverse order
		LinkedStack<Character> stack = new LinkedStack<Character>();


    final Scanner input = new Scanner(System.in);
		String line = null;
		while ((line = input.nextLine()) != null) {
			line = input.next();
			System.out.println(line);
			for(int i = 0; i <line.length(); i++) {
				stack.push(line.charAt(i));
			}





		}
		String tempWord= "";
		for(int i = 0; i <line.length(); i++) {
			tempWord += stack.pop();}
		System.out.println(tempWord);


	}
}
