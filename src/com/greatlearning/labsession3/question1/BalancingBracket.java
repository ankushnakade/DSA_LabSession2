package com.greatlearning.labsession3.question1;

import java.util.Stack;

public class BalancingBracket {

	public static void main(String[] args) {
		String input = "{[[(]]}";
		boolean result = isBalanced(input);
		if (result) {
			System.out.println("Given string is balanced");
		} else {
			System.out.println("Given string is not balanced.");
		}
	}

	public static boolean isBalanced(String input) {

		Stack<Character> data = new Stack<Character>();

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (ch == '{' || ch == '(' || ch == '[') {
				data.push(ch);
				continue;
			}
			if (data.isEmpty()) {
				return false;
			}
			
			char matchCh = data.pop();
			
			switch (matchCh) {
				case ')': {
					if (matchCh != '(') {
						return false;
					}
					break;
				}
				case '}': {
					if (matchCh != '{') {
						return false;
					}
					break;
				}
				case ']': {
					if (matchCh != '[') {
						return false;
					}
					break;
				}
			}
		}
		return data.isEmpty();
	}
}