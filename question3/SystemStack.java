import java.util.Stack;

public class SystemStack {

  // Simulating the system stack for function calls
  public static void systemStackSimulation() {
    Stack<Integer> stack = new Stack<>();

    // Push function calls onto the stack
    stack.push(1); // Function A
    System.out.println("Function A called");

    stack.push(2); // Function B
    System.out.println("Function B called");

    stack.push(3); // Function C
    System.out.println("Function C called");

    // Pop function calls from the stack to simulate returning
    while (!stack.isEmpty()) {
      int func = stack.pop();
      if (func == 1) {
        System.out.println("Function A returned");
      } else if (func == 2) {
        System.out.println("Function B returned");
      } else if (func == 3) {
        System.out.println("Function C returned");
      }
    }
  }

  public static void main(String[] args) {
    // Run the system stack simulation
    systemStackSimulation();
  }
}