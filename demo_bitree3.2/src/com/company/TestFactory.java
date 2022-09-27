package com.company;

public class TestFactory {

    public static BST<String,String> generateBST(){
        BST<String,String> bst = new BST<>();
        bst.put("A","узел1");
        bst.put("B","узел еще ");
        bst.put("C","узел");
        bst.put("D","привет");
        bst.put("E","фазан");
        bst.put("I","фазан");
        bst.put("Z","фазан");
        return bst;
    }
}
