package Adapter;

public interface MyQueue<E> {
    public void enQueue(E element);
    public E deQueue();
}
