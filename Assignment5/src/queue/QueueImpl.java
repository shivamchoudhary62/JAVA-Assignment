package queue;

public interface QueueImpl {
    void insert(int value) throws Exception;
    int delete() throws Exception;
    void display();
}
