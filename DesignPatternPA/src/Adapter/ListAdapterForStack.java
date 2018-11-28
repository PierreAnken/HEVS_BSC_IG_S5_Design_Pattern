package Adapter;

import java.util.List;

public class ListAdapterForStack<Integer> implements MyStack{

    private List<Integer> liste;

    public ListAdapterForStack(List<Integer> liste)
    {
        this.liste = liste;
    }


    @Override
    public void push(Object element) {

        System.out.println("push "+ ((Integer)element).toString());
        liste.add((Integer)element);
    }

    @Override
    public Object pop() {

        Integer front = liste.get(liste.size()-1);
        System.out.println("pop");
        liste.remove(front);
        return front;
    }

    public String toString(){
        return liste.toString();
    }
}