package com.company;

import java.util.Iterator;

public class RandomBag<Item> implements Iterable<Item>{
    private Node first;
    private int size;

    public RandomBag() {
        first=null;
        size=0;
    }

    private class Node{
        Item item;
        Node next;
    }

    public void add(Item item){
        Node oldfirst = first;
        first = new  Node();
        first.item = item;
        first.next = oldfirst;
        size++;
    }

    @Override
    public Iterator<Item> iterator() {
        return new ListIterator();
    }
    private class ListIterator implements Iterator<Item>
    {
        private int N;
        private Item[] items;
        private Node current;

        public ListIterator() {
            N=size;
            current=first;
            items = (Item[]) new Object[size];
            for(int i = 0;i<size;i++){
                items[i] = current.item;
                current = current.next;
            }
        }

        public boolean hasNext(){
            return N>0;
        }
        public void remove(){}
        public Item next(){
            int random = (int) (0+ Math.random()*N);
            Item item  =  items[random];
            items[random] = items[N-1];
            items[N-1]=null;
            N--;
            return item;
        }
    }
}
