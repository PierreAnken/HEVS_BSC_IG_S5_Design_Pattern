package Adapter;

import java.util.List;

public class ListAdapterForQueue<Integer> implements  MyQueue{

    private List<Integer> liste;

    public ListAdapterForQueue(List<Integer> liste)
    {
        this.liste = liste;
    }

    @Override
    public void enQueue(Object element) {
        System.out.println("enQueue "+ ((Integer)element).toString());
        liste.add(0,(Integer)element);
    }

    @Override
    public Object deQueue() {

        System.out.println("deQueue");
        Integer top = liste.get(liste.size()-1);
        liste.remove(top);
        return top;
    }

    public String toString(){
        return liste.toString();
    }
}
