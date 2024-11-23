package queue;

public class Main {
    public static void main(String[] args) {
        try {
            QueueDemo queue = new QueueDemo();
            queue.insert(10);
            queue.insert(20);
            queue.insert(30);
            queue.display();

            int deletedValue = queue.delete();
            System.out.println("Deleted value: " + deletedValue);
            queue.display();

            queue.insert(40);
            queue.insert(50);
            queue.display();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
