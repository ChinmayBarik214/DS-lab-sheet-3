import java.util.LinkedList;
import java.util.Queue;

public class PrintQueue {

    private Queue<String> queue;

    // Constructor to initialize the print queue
    public PrintQueue() {
        queue = new LinkedList<>();
    }

    // Method to add a document to the queue (enqueue)
    public void enqueue(String document) {
        queue.add(document);
    }

    // Method to process the next document in the queue (dequeue)
    public String dequeue() {
        if (queue.isEmpty()) {
            return null;
        }
        String processedDoc = queue.poll();
        System.out.println(processedDoc);
        return processedDoc;
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public static void main(String[] args) {
        // Create a PrintQueue object
        PrintQueue printQueue = new PrintQueue();

        // Add documents to the queue
        printQueue.enqueue("doc1");
        printQueue.enqueue("doc2");

        // Process documents
        printQueue.dequeue();
    }
}