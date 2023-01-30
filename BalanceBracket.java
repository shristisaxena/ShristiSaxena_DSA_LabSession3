/* Question → 1) Write a program of Balancing Brackets, use a suitable data structure to print 
whether the string entered is a Balanced Brackets or Unbalanced String. */

package com.greatlearning.lab3;

import java.util.Stack;
import java.util.Scanner;

public class BalanceBracket {

	//Function to check if brackets are balanced
	static boolean areBracketsBalanced(String bracketexpression)
	{

		Stack<Character> stack = new Stack<Character>();

		//For traversing the expression
		for(int i = 0; i < bracketexpression.length(); i++)
		{
			char character = bracketexpression.charAt(i);

			if (character =='(' || character == '[' || character == '{') 
			{
				//Push the element into the stack
				stack.push(character);
				continue;
			}

			if(stack.isEmpty())
				return false;
			char check;
			switch(character) {

			case '}' :
				check = stack.pop();
				if (character == '(' || character == '[')
					return false;
				break;

			case ')' :
				check = stack.pop();
				if (character == '{' || character == '[')
					return false;
				break;

			case ']' :
				check = stack.pop();
				if(character =='(' || character == '{')
					return false;
				break;

			}
		}
		return (stack.isEmpty());

	}
	//Main Code
	public static void main(String[] args)
	{
		String bracketexpression ="(({[]}))";
		Boolean result;

		result = areBracketsBalanced(bracketexpression);

		if (result)
			System.out.println(" The entered String has balanced brackets. ");
		else
			System.out.println(" The entered String has imbalanced brackets. ");


	}




}

