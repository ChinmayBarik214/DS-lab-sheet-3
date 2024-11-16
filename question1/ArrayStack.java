public class ArrayStack {
  static final int MAX = 1000;
  int top;
  int a[] = new int[MAX]; // Maximum size of Stack

  public static void main(String args[]) {
    ArrayStack s = new ArrayStack();
    s.push(1);
    s.push(2);
    s.pop();
    s.peek();
  }

  boolean isEmpty() {
    return (top < 0);
  }

  ArrayStack() {
    top = -1;
  }

  boolean push(int x) {
    if (top >= (MAX - 1)) {
      System.out.println("Stack Overflow");
      return false;
    } else {
      a[++top] = x;
      return true;
    }
  }

  int pop() {
    if (top < 0) {
      System.out.println("Stack Underflow");
      return 0;
    } else {
      int x = a[top--];
      return x;
    }
  }

  int peek() {
    if (top < 0) {
      System.out.println("Stack Underflow");
      return 0;
    } else {
      int x = a[top];
      System.out.println(x);
      return 0;
    }
  }

  void print() {
    for (int i = top; i > -1; i--) {
      System.out.print(" " + a[i]);
    }
  }
}
