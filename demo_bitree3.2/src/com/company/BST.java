package com.company;


import java.util.ArrayDeque;
import java.util.Queue;

public class BST<Key extends Comparable<Key>, Value> {
    private Node root;

    private class Node {
        private Key key;
        private Value value;
        private Node left, right;
        private int N;

        public Node(Key key, Value value, int N) {
            this.key = key;
            this.value = value;
            this.N = N;
        }
    }

    public int size() {
        return size(root);
    }

    private int size(Node x) {
        if (x == null) return 0;
        else return x.N;
    }

    public Value get(Key key) {
        return get(root, key);
    }

    private Value get(Node x, Key key) {
        if (x == null)
            return null;
        int cmp = key.compareTo(x.key);
        if (cmp < 0) return get(x.left, key);
        else if (cmp > 0) return get(x.right, key);
        else return x.value;
    }

    public void put(Key key, Value value) {
        root = put(root, key, value);
    }

    private Node put(Node x, Key key, Value value) {
        if (x == null) return new Node(key, value, 1);
        int cmp = key.compareTo(x.key);
        if (cmp < 0) x.left = put(x.left, key, value);
        else if (cmp > 0) x.right = put(x.right, key, value);
        else x.value = value;
        x.N = size(x.left) + size(x.right) + 1;
        return x;
    }

    public Key min() {
        Node x = root;
        while (x != null) {
            if (x.left == null) {
                return x.key;
            } else {
                x = x.left;
            }
        }
        return null;
    }

    public Key max() {
        Node x = root;
        while (x != null) {
            if (x.right == null) {
                return x.key;
            } else {
                x = x.right;
            }
        }
        return null;
    }

    public Key floor(Key key) {
        Node x = root;
        while (x != null) {
            int cmp = key.compareTo(x.key);
            if (cmp == 0) return x.key;
            else if (cmp < 0) x = x.left;
            else {
                Node t =x.right;
                if (t != null) return t.key;
                else return x.key;
            }
        }
        return null;
    }

    public Key select(int k) {
        Node x = root;
        int t = 0;
        while (x != null) {
            if (t > k) {
                x = x.left;
            } else if (t < k) {
                x = x.right;
                k = k - t - 1;
            } else return x.key;
        }
        return null;
    }

    public int rank(Key key) {
        Node x = root;
        int rank = 0;
        while (x != null) {
            int cmp = key.compareTo(x.key);
            if (cmp < 0) x = x.left;
            else if (cmp > 0) {
                x = x.right;
                rank++;
            } else return rank;
        }
        return 0;
    }

    public void deleteMin(){
        root =  deleteMin(root);
    }

    private Node deleteMin(Node x){
        if(x.left==null) return x.right;
        x.left = deleteMin(x.left);
        x.N = size(x.left) + size(x.right)+1;
        return x;
    }

    public void delete(Key key){
        root = delete(root,key);
    }

    private Node delete(Node x , Key key){
        if(x==null) return null;
        int cmp = key.compareTo(x.key);
        if(cmp<0) x.left = delete(x.left,key);
        else if(cmp>0) x.right = delete(x.right,key);
        else{
            if(x.right==null) return x.left;
            if(x.left==null) return x.right;
            Node t= x;
            x=min(x.right);
            x.right = deleteMin(t.right);
            x.left = t.left;
        }
        x.N = size(x.left) + size(x.right) +1;
        return x;
    }
    private Node min(Node x){
        if(x.left == null) return x;
        return min(x.left);
    }

    public Iterable<Key> keys(){
        return keys(min(),max());
    }

    public Iterable<Key> keys(Key lo,Key hi)
    {
        Queue<Key> queue=new ArrayDeque<>();
        keys(root,queue,lo,hi);
        return queue;
    }

    private void keys(Node x , Queue<Key> queue, Key lo,Key hi){
        if(x==null) return;
        int cmplo = lo.compareTo(x.key);
        int cmphi = hi.compareTo(x.key);
        if(cmplo<0) keys(x.left,queue,lo,hi);
        if(cmplo<=0&& cmphi>=0) queue.add(x.key);
        if(cmphi>0) keys(x.right,queue,lo,hi);
    }
}

