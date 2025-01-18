public class queue {
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60); // This will show "Queue is full" message

        System.out.println("Front element is:" + queue.peek());

        while (!queue.isEmpty()) {
            int value = queue.dequeue();
            System.out.println("Dequeued: " + value);
        }

        queue.dequeue();
    }
}


void queue(int value) {
    if (isFull()) {
        System.out.println("Queue is full");
        return;
    }
    rear = (rear + 1) % capacity;
    array[rear] = value;
    size++;
    System.out.println(value + " enqueued to queue");
}

void dequeue() {
    if (isEmpty()) {
        System.out.println("Queue is empty");
        return;
    }
    int value = array[front];
    front = (front + 1) % capacity;
    size--;
    System.out.println(value + " dequeued from queue");
    return value;
}

void peek() {
    if (isEmpty()) {
        System.out.println("Queue is empty");
        return;
    }
    return array[front];
}


void isEmpty() {
    return size == 0;
}

void isFull() {
    return size == capacity;
    
}