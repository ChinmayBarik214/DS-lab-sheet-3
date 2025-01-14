import java.util.*;

public class ReverseString {
	// Driver code
	public static void main(String[] args) {
		System.out.println(reverseString("hello"));
	}

	public static String reverseString(String str) {
		char[] reverseString = new char[str.length()];
		// Declare a stack of type Character
		Stack<Character> stack = new Stack<Character>();

		// Traverse the String and push the character one by
		// one into the Stack
		for (int i = 0; i < str.length(); i++) {
			// push the character into the Stack
			stack.push(str.charAt(i));
		}

		// Now Pop the Characters from the stack until it
		// becomes empty

		int i = 0;
		while (!stack.isEmpty()) { // popping element until
			// stack become empty
			// get the character from the top of the stack
			reverseString[i++] = stack.pop();
		}
		// return string object
		return new String(reverseString);
	}
}
