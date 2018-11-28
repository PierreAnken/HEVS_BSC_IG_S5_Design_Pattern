package Adapter;

import java.util.ArrayList;
import java.util.List;

public class Main {

    // Adapter: Implemente l'inferface que l'on veut adapter
    // Facade: Definit une interface simplifiée qui effectue plusieurs actions par mehtode

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(22);
        testQueue(new ListAdapterForQueue<Integer>(list1));

        List<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(3);
        testStack(new ListAdapterForStack<Integer>(list2));
    }

    public static void testQueue(MyQueue<Integer> queueAdapter) {
        System.out.println("Testing the Queue adapter");
        for(int i = 0; i < 10 ; i++) {
            queueAdapter.enQueue(i);
        }
        System.out.println(queueAdapter.toString());
        queueAdapter.deQueue();
        System.out.println(queueAdapter.toString());
        queueAdapter.enQueue(40);
        System.out.println(queueAdapter.toString());
        System.out.println();
    }

    public static void testStack(MyStack<Integer> stackAdapter) {
        System.out.println("Testing the Stack adapter");
        for(int i = 0; i < 10 ; i++) {
            stackAdapter.push(i);
        }
        System.out.println(stackAdapter.toString());
        stackAdapter.pop();
        System.out.println(stackAdapter.toString());
        stackAdapter.push(40);;
        System.out.println(stackAdapter.toString());
        System.out.println();
    }

}
