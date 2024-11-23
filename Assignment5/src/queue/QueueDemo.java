package queue;

public class QueueDemo implements QueueImpl {
    private static final int MAX_SIZE = 10;
    private int[] queue;
    private int front;
    private int rear;
    private int size;

    public QueueDemo() {
        queue = new int[MAX_SIZE];
        front = 0;
        rear = -1;
        size = 0;
    }

    @Override
    public void insert(int value) throws Exception {
        if (size == MAX_SIZE) {
            throw new Exception("Queue overflow. Cannot insert more elements.");
        }
        rear = (rear + 1) % MAX_SIZE;
        queue[rear] = value;
        size++;
    }

    @Override
    public int delete() throws Exception {
        if (size == 0) {
            throw new Exception("Queue underflow. Cannot delete elements.");
        }
        int value = queue[front];
        front = (front + 1) % MAX_SIZE;
        size--;
        return value;
    }

    @Override
    public void display() {
        if (size == 0) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % MAX_SIZE] + " ");
        }
        System.out.println();
    }
}
