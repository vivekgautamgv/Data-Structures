public class queue {
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60); // This will show "Queue is full" message

        System.out.println("Front element is: " + queue.peek());

        while (!queue.isEmpty()) {
            int value = queue.dequeue();
            System.out.println("Dequeued: " + value);
        }

        queue.dequeue(); // This will show "Queue is empty" message
    }
}

