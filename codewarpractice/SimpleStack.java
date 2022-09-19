package codewarpractice;

import java.util.ArrayList;

public class SimpleStack<T> implements Stack<T> {
   private ArrayList<T> tArrayList = new ArrayList<>();

    @Override
    public void push(T item) {
        tArrayList.add(0,item);
    }

    @Override
    public T pop() {
        return tArrayList.remove(0);
    }

    @Override
    public boolean isEmpty() {
        return tArrayList.isEmpty();
    }
}
