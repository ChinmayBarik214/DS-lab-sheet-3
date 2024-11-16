class Node {
  int data;
  Node next;

  Node(int new_data) {
    this.data = new_data;
    this.next = null;
  }
}

public class LinkedListStack {
  public static void main(String[] args) {
    // Creating a stack
    LinkedListStack st = new LinkedListStack();
    st.push(1);
    st.push(2);
    st.pop();
    System.out.println(st.peek());
  }

  // Head of the linked list
  Node head;

  // Constructor to initialize the stack
  LinkedListStack() {
    this.head = null;
  }

  // Function to check if the stack is empty
  boolean isEmpty() {

    // If head is null, the stack is empty
    return head == null;
  }

  // Function to push an element onto the stack
  void push(int new_data) {
    try {
      Node new_node = new Node(new_data);
      new_node.next = head;
      head = new_node;
    } catch (OutOfMemoryError e) {
      System.out.println("\nStack Overflow");
      return;
    }
  }

  // Function to remove the top element from the stack
  void pop() {

    // Check for stack underflow
    if (isEmpty()) {
      System.out.println("\nStack Underflow");
      return;
    } else {

      // Assign the current top to a temporary
      // variable
      Node temp = head;

      // Update the top to the next node
      head = head.next;

      // Deallocate the memory of the old top node
      temp = null;
    }
  }

  // Function to return the top element of the stack
  int peek() {

    // If stack is not empty, return the top element
    if (!isEmpty())
      return head.data;
    else {
      System.out.println("\nStack is empty");
      return Integer.MIN_VALUE;
    }
  }
}